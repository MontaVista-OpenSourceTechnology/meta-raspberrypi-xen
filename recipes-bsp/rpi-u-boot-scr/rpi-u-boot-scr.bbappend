
do_compile_rpixen() {
    # Create the boot script for u-boot.  For my machine the chosen
    # entry "fdt print /chosen" looks like the following after this:
    #
    # chosen {
    #	xen,xen-bootargs = "console=dtuart dtuart=/soc/serial@7e215040 sync_console dom0_mem=512M dom0_mem=512M bootscrub=0";
    #	ranges;
    #	#size-cells = <0x00000001>;
    #	#address-cells = <0x00000001>;
    #	compatible = "simple_bus";
    #	kaslr-seed = <0x19079e9a 0xfb073d5d>;
    #	bootargs = "coherent_pool=1M 8250.nr_uarts=1 cma=64M cma=256M  smsc95xx.macaddr=DC:A6:32:4F:3A:CD vc_mem.mem_base=0x3ec00000 vc_mem.mem_size=0x40000000  console=hvc0 clk_ignore_unused root=/dev/mmcblk0p2 rootwait";
    #	dom0 {
    #		reg = <0x00400000 0x01000000>;
    #		compatible = "xen,linux-zimage,", "xen,multiboot-module";
    #	};
    #	framebuffer@00000000 {
    #		status = "okay";
    #		compatible = "simple-framebuffer";
    #		format = "r5g6b5";
    #		stride = <0x00000000>;
    #		height = <0x00000000>;
    #		width = <0x00000000>;
    #		reg = <0x00000000 0x00000000>;
    #	};
    #};

    # Set the fdt address to what came from the GPU, so we can edit it.
    echo 'fdt addr ${fdt_addr}' >"${WORKDIR}/boot.cmd"

    # Pull the bootargs that the GPU has edited.
    echo 'fdt get value bootargs /chosen bootargs' >>"${WORKDIR}/boot.cmd"

    # Add some space to the fdt so we can edit it
    echo 'fdt resize 0x1000' >>"${WORKDIR}/boot.cmd"

    # Add boot arguments for Xen
    echo 'fdt set /chosen xen,xen-bootargs "console=dtuart dtuart=/soc/serial@7e215040 sync_console dom0_mem=512M dom0_mem=512M bootscrub=0"' >>"${WORKDIR}/boot.cmd"

    # Add a dom0 node to chosen to put Linux boot information in.
    echo 'fdt mknode /chosen dom0' >>"${WORKDIR}/boot.cmd"

    # Set this for the Linux boot command.
    echo 'fdt set /chosen/dom0 compatible "xen,linux-zimage", "xen,multiboot-module"' >>"${WORKDIR}/boot.cmd"

    # Set the address and size for the Linux kernel so Xen can pick it up.
    echo 'fdt set /chosen/dom0 reg <0x00400000 0x01000000>' >>"${WORKDIR}/boot.cmd"

    # This is required by Xen to know where PCI is.
    echo 'fdt set /scb/pcie@7d500000 device_type "pci"' >>"${WORKDIR}/boot.cmd"

    # For some reason if we don't delay the MMC card isn't ready.
    echo 'sleep 1' >>"${WORKDIR}/boot.cmd"

    # Load xen into memory.
    echo 'fatload mmc 0:1 0x00200000 xen' >>"${WORKDIR}/boot.cmd"

    # Load the Linux kernel into memory.
    echo 'fatload mmc 0:1 0x00400000 Image' >>"${WORKDIR}/boot.cmd"

    # Boot Xen.
    echo 'booti 0x00200000 - ${fdt_addr}' >>"${WORKDIR}/boot.cmd"

    mkimage -A arm -T script -C none -n "Boot script" -d "${WORKDIR}/boot.cmd" boot.scr
}
