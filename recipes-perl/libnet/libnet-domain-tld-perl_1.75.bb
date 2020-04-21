SUMMARY = "Work with TLD names"
DESCRIPTION = "The purpose of this module is to provide user with current list \
of available top level domain names including new ICANN additions and ccTLDs."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0+"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a89fc6431f978476bd49e3f7a26a1a1e"
SRC_URI = "https://cpan.metacpan.org/authors/id/A/AL/ALEXP/Net-Domain-TLD-${PV}.tar.gz"

S = "${WORKDIR}/Net-Domain-TLD-${PV}"

RDEPENDS_${PN} += "perl-module-base"

inherit cpan

SRC_URI[md5sum] = "d661c3d8fa1080bf7d75ca049d9f4a8e"
SRC_URI[sha256sum] = "4c37f811184d68ac4179d48c10ea31922dd5fca2c1bffcdcd95c5a2a3b4002ee"

BBCLASSEXTEND="native"
