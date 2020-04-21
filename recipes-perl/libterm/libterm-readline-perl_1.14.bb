SUMMARY = "Perl interface to various readline packages"
DESCRIPTION = "Perl interface to various C<readline> packages.  If no \
real package is found, substitutes stubs instead of basic functions."
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0+"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1bfe3fc6a50d3513984ef3617938ae09"
SRC_URI = "https://cpan.metacpan.org/authors/id/F/FL/FLORA/Term-ReadLine-${PV}.tar.gz"

S = "${WORKDIR}/Term-ReadLine-${PV}"

inherit cpan

SRC_URI[md5sum] = "60a3c2aeb765c7b7f6ee185c5d812b3d"
SRC_URI[sha256sum] = "54523c72b26a04608170849013a433ba400f66b4f9b0524201bfd37ff6e3c477"

BBCLASSEXTEND="native"
