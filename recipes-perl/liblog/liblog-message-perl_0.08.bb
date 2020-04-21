SUMMARY = "A generic message storing mechanism"
DESCRIPTION = "This module enables you to do generic message logging \
throughout programs and projects. Every message will be logged with \
stacktraces, timestamps and so on. You can use built-in handlers \
immediately, or after the fact when you inspect the error stack. It \
is highly configurable and let's you even provide your own handlers \
for dealing with messages."
SECTION = "libs"
LICENSE = "Artistic-1.0"

LIC_FILES_CHKSUM = "file://README;beginline=36;endline=41;md5=722b591573eae09d26997366cd63125d"
SRC_URI = "https://cpan.metacpan.org/authors/id/B/BI/BINGOS/Log-Message-${PV}.tar.gz"

S = "${WORKDIR}/Log-Message-${PV}"

inherit cpan

RDEPENDS_${PN} += "perl-module-load"

SRC_URI[md5sum] = "406fe7d1e37980afa105b663c436c4af"
SRC_URI[sha256sum] = "bd697dd62aaf26d118e9f0a0813429deb1c544e4501559879b61fcbdfe99fe46"

BBCLASSEXTEND="native"
