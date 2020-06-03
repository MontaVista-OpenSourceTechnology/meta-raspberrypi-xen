FILESEXTRAPATHS_prepend_rpixen := "${THISDIR}/files:"

SRC_URI_append_rpixen = " file://defconfig \
	file://0001-xen-arm-Allow-a-platform-to-override-the-DMA-width.patch \
	file://0002-xen-arm-Take-into-account-the-DMA-width-when-allocat.patch \
	file://0003-xen-arm-plat-Allocate-as-much-as-possible-memory-bel.patch \
"

XEN_REL_rpixen = "4.13"
SRCREV_rpixen = "a2e84d8e42c9e878fff17b738d8e5c5d83888f31"

LIC_FILES_CHKSUM_rpixen = "file://COPYING;md5=4295d895d4b5ce9d070263d52f030e49"
