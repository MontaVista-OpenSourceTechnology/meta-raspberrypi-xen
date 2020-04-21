SUMMARY = "IPv4 and IPv6 validation methods"
DESCRIPTION = "This module provides a number IP address validation subs that \
both validate and untaint their input. This includes both basic validation \
(is_ipv4() and is_ipv6()) and special cases like checking whether an address \
belongs to a specific network or whether an address is public or private \
(reserved)."
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0+"

LIC_FILES_CHKSUM = "file://LICENSE;md5=c223032ecfb91428cd81fed0531d968d"
SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Data-Validate-IP-${PV}.tar.gz"

S = "${WORKDIR}/Data-Validate-IP-${PV}"

RDEPENDS_${PN} += "libnetaddr-ip-perl"

inherit cpan

SRC_URI[md5sum] = "cb0bbf1b555cceb9dc9d4a1cae940868"
SRC_URI[sha256sum] = "e1aa92235dcb9c6fd9b6c8cda184d1af73537cc77f4f83a0f88207a8bfbfb7d6"

BBCLASSEXTEND="native"
