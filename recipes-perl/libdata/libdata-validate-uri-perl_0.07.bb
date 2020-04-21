SUMMARY = "common url validation methods"
DESCRIPTION = "This module collects common URI validation routines to make \
input validation, and untainting easier and more readable."
SECTION = "libs"
LICENSE = "Artistic-1.0"

LIC_FILES_CHKSUM = "file://README;beginline=187;endline=191;md5=62b8e98dd82fe7300b619ff9b8ad7d69"
SRC_URI = "https://cpan.metacpan.org/authors/id/S/SO/SONNEN/Data-Validate-URI-${PV}.tar.gz"

S = "${WORKDIR}/Data-Validate-URI-${PV}"

inherit cpan

RDEPENDS_{$PN} += "perl-module-autoloader libnet-domain-tld-perl"

SRC_URI[md5sum] = "7798746c9bac48b9384d4e631bcaf16b"
SRC_URI[sha256sum] = "f06418d2a4603913d1b6ce52b167dd13e787e13bf2be325a065df7d408f79c60"

BBCLASSEXTEND="native"
