
XEN_REL_rpixen = "4.13"
SRCREV_rpixen = "b66ce5058ec9ce84418cedd39b2bf07b7c5a1f65"

SRC_URI_rpixen = " \
    git://xenbits.xen.org/xen.git;branch=${XEN_BRANCH} \
    "

# qemu is required, of course.
RDEPENDS_${PN} += "qemu"

# We need the real ifupdown, not the busybox version.
RDEPENDS_${PN} += "ifupdown"

LIC_FILES_CHKSUM_rpixen = "file://COPYING;md5=4295d895d4b5ce9d070263d52f030e49"
