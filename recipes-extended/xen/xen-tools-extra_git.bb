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

# We have openssh in here because the xen-tools-extra programs require it
# And dropbear will not work.
RDEPENDS_${PN} = "xen-tools perl \
	debootstrap \
	perl-module-english \
	perl-module-tie-hash-namedcapture \
	perl-module-digest-md5 \
	perl-module-env \
	perl-module-file-temp \
	perl-module-pod-text \
	libfile-slurp-perl \
	libdata-validate-uri-perl \
	libdata-validate-ip-perl \
	libdata-validate-domain-perl \
	libtext-template-perl \
	libconfig-inifiles-perl \
	libfile-which-perl \
	libterm-ui-perl \
	perl-module-deprecate \
	perl-module-params-check \
	libterm-readline-perl \
	libsort-versions-perl \
	openssh \
	e2fsprogs \
	"

inherit perl-version
inherit cpan-base

do_compile() {
	oe_runmake manpages || die "make failed"
}

do_install() {
	# There is an issue with the makefile not creating role.d until
	# after the files are copied there, create the directory first to
	# avoid this.
	install -d ${D}/etc/xen-tools/role.d
	oe_runmake install DESTDIR="${D}"
	install -d ${D}/${libdir}/perl5/${@get_perl_version(d)}
	mv ${D}/usr/share/perl5/Xen ${D}/${libdir}/perl5/${@get_perl_version(d)}
	rmdir ${D}/usr/share/perl5
}

FILES_${PN} += " \
	${datadir}/bash-completion/completions/xen-tools \
	${libdir}/perl5/${@get_perl_version(d)}/Xen \
	${datadir}/xen-tools \
	"
