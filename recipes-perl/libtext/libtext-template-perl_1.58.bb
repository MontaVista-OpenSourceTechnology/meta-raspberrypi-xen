SUMMARY = "Expand template text with embedded Perl"
DESCRIPTION = "This is a library for generating form letters, building HTML \
pages, or filling in templates generally.  A `template' is a piece of text \
that has little Perl programs embedded in it here and there.  When you \
`fill in' a template, you evaluate the little programs and replace them \
with their values."
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0+"

LIC_FILES_CHKSUM = "file://LICENSE;md5=97c2218f01bb60644ec141f8761067e5"
SRC_URI = "https://cpan.metacpan.org/authors/id/M/MS/MSCHOUT/Text-Template-${PV}.tar.gz"

S = "${WORKDIR}/Text-Template-${PV}"

inherit cpan

SRC_URI[md5sum] = "505a0ebba8fc461884b2f5494639565a"
SRC_URI[sha256sum] = "0c465757782c4bfb9b17335307a8286771fd36ea04d259bc454ac63355f2a287"

BBCLASSEXTEND="native"
