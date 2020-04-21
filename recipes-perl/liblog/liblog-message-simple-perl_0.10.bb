SUMMARY = "A simplified frontend to Log::Message"
DESCRIPTION = "This module is a simplified frontend to Log::Message, offering \
most common use for logging, and easy access to the stack (in \
both raw and pretty-printable form)."
SECTION = "libs"
LICENSE = "Artistic-1.0"

LIC_FILES_CHKSUM = "file://README;beginline=36;endline=41;md5=722b591573eae09d26997366cd63125d"
SRC_URI = "https://cpan.metacpan.org/authors/id/B/BI/BINGOS/Log-Message-Simple-${PV}.tar.gz"

S = "${WORKDIR}/Log-Message-Simple-${PV}"

inherit cpan

RDEPENDS_${PN} += "liblog-message-perl"

SRC_URI[md5sum] = "0a0f9df6bc1148cc2aae4cb2882c0664"
SRC_URI[sha256sum] = "aa12d1a4c0ac260b94d448fa01feba242a8a85cb6cbfdc66432e3b5b468add96"

BBCLASSEXTEND="native"
