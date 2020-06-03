SUMMARY = "Manages IPv4 and IPv6 addresses and subnets"
DESCRIPTION = "This module provides an object-oriented abstraction on top of \
IP addresses or IP subnets that allows for easy manipulations. Version 4.xx \
of NetAddr::IP will work with older versions of Perl and is compatible with \
Math::BigInt."
SECTION = "libs"
LICENSE = "GPL-2.0+"

LIC_FILES_CHKSUM = "file://Copying;md5=cde580764a0fbc0f02fafde4c65d6227"
SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MIKER/NetAddr-IP-${PV}.tar.gz"

S = "${WORKDIR}/NetAddr-IP-${PV}"

inherit cpan

RDEPENDS_${PN} += "perl-module-socket"

do_configure_prepend() {
    # Generate config.h file
    cd Lite/Util
    echo "***Configuring in `pwd`***"
    sh ./configure.gcc --build=${BUILD_SYS} --host=${HOST_SYS} --target=${TARGET_SYS}
    cpan_do_configure
    cd ../..
}

do_compile() {
    cpan_do_compile
}

SRC_URI[md5sum] = "990dfcbffae356835c536e8ab56a2880"
SRC_URI[sha256sum] = "ec5a82dfb7028bcd28bb3d569f95d87dd4166cc19867f2184ed3a59f6d6ca0e7"

BBCLASSEXTEND="native"
