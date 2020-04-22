SUMMARY = "Packages required for Xen Dom0"
DESCRIPTION = "Packages required for Xen Dom0 to work."
LICENSE = "MIT"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = " \
    xen xen-tools xen-tools-extra \
    ${@bb.utils.contains('MACHINE_FEATURES', 'acpi', 'kernel-module-xen-acpi-processor', '', d)} \
    kernel-module-xen-blkback \
    kernel-module-xen-blkfront \
    kernel-module-xen-evtchn \
    kernel-module-xen-fbfront \
    kernel-module-xenfs \
    kernel-module-xen-gntalloc \
    kernel-module-xen-gntdev \
    kernel-module-xen-kbdfront \
    kernel-module-xen-netback \
    kernel-module-xen-netfront \
    kernel-module-xen-privcmd \
    kernel-module-xen-scsifront \
    kernel-module-xen-wdt \
"

RRECOMMENDS_${PN} = ""
