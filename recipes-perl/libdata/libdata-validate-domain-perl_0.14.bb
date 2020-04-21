SUMMARY = "Domain and host name validation"
DESCRIPTION = "This module offers a few subroutines for validating domain and \
host names."
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0+"

LIC_FILES_CHKSUM = "file://LICENSE;md5=c223032ecfb91428cd81fed0531d968d"
SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Data-Validate-Domain-${PV}.tar.gz"

S = "${WORKDIR}/Data-Validate-Domain-${PV}"

inherit cpan

SRC_URI[md5sum] = "699d4bde18afa56554d2579c1137ca8d"
SRC_URI[sha256sum] = "4470f253b8d2720a4dd3fa3ae550995417c2269f3be7ff030e01afa04a3a9421"

BBCLASSEXTEND="native"
