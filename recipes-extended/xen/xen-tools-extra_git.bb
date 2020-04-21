# This is the xen-tools set of programs from Ubuntu, whose name unfortunately
# conflicts with the xen-tools package in yocto.

SUMMARY = "Xen hypervisor extra tools"
DESCRIPTION = "Helper tools for using the Xen hypervisor"
HOMEPAGE = "https://github.com/xen-tools/xen-tools"
SECTIONS = "console/tools"

SRCREV = "7c8d466a536ccbd45bcf9393f4345e1578b2fc94"
PV = "4.8"

XEN_TOOLS_BRANCH = "master"

SRC_URI = " \
    git://github.com/xen-tools/xen-tools.git;branch=${XEN_TOOLS_BRANCH} \
    "
S = "${WORKDIR}/git"

LICENSE = "Artistic-1.0 | GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=250cdeda9811e1f554094a6f1dd179fc"

# For pod2man
DEPENDS = "perl-native"

RDEPENDS_${PN} = "xen-tools perl"
RDEPENDS_${PN}-misc = "xen-tools perl"

do_compile() {
	oe_runmake manpages || die "make failed"
}

do_install() {
	oe_runmake install DESTDIR="${D}"
}

PACKAGES += "${PN}-misc"

FILES_${PN} += " \
	${datadir}/bash-completion/completions/xen-tools \
	${datadir}/perl5/Xen/Tools/Common.pm \
	"

FILES_${PN}-misc = "${datadir}/xen-tools"
