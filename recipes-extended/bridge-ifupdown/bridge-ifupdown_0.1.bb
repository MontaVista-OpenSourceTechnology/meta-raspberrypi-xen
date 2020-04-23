LICENSE="GPL-2.0"
LIC_FILES_CHKSUM = "file://bridge-ifupdown;beginline=3;endline=20;md5=d5e5c80073c3e44028aa68f403f4f931"
SUMMARY = "A small script to aid in bridge setup for /etc/network/interfaces"
DESCRIPTION="A script to add to pre-up and post-down to make it easier to \
set up bridges."
HOMEPAGE="http://www.mvista.com"

inherit allarch

RDEPENDS_${PN} = "ifupdown"

PR = "r1"

SRC_URI = "file://bridge-ifupdown"
S="${WORKDIR}"

do_install() {
	install -d ${D}/sbin
	install -m 0755 bridge-ifupdown ${D}/sbin
}

FILES_${PN} = "/sbin/bridge-ifupdown"
