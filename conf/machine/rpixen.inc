# Install Xen in the rpi root filesystem.
FATPAYLOAD += "/boot/xen"

# Xen dom0 console.
KERNEL_CONSOLE = "hvc0"
SERIAL_CONSOLES = "115200;hvc0"

# Xen uses u-boot for configuration and uses the uart.
RPI_USE_U_BOOT = "1"
ENABLE_UART = "1"

# Make sure the Xen tools and xen are on the dom0 target
MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS = "packagegroup-xen-dom0"

# We use this to only do certain things when we are using a Xen machine.
MACHINEOVERRIDES .= ":rpixen"
