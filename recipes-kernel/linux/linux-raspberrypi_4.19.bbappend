FILESEXTRAPATHS_prepend_rpixen := "${THISDIR}/files:"

SRC_URI_append_rpixen += " file://0002-Disable-DMA-in-sdhci-driver.patch \
	    file://0003-Fix-PCIe-in-dom0-for-RPi4.patch \
	    file://xen.cfg \
"

do_deploy_append_rpixen() {
    # Override the cmdline.txt to be what we need.
    echo "console=hvc0 clk_ignore_unused root=/dev/mmcblk0p2 rootwait" >${DEPLOYDIR}/bcm2835-bootfiles/cmdline.txt
}
