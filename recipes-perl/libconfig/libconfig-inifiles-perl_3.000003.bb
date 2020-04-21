SUMMARY = "A module for reading .ini-style configuration files"
DESCRIPTION = "Config::IniFiles provides a way to have readable configuration \
files outside your Perl script. Configurations can be imported (inherited, \
stacked,...), sections can be grouped, and settings can be accessed from \
a tied hash "
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0+"

LIC_FILES_CHKSUM = "file://LICENSE;md5=8f3499d09ee74a050c0319391ff9d100"
SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHLOMIF/Config-IniFiles-${PV}.tar.gz"

S = "${WORKDIR}/Config-IniFiles-${PV}"

inherit cpan

SRC_URI[md5sum] = "6f05ed5e2eec89914a8542248c959914"
SRC_URI[sha256sum] = "3c457b65d98e5ff40bdb9cf814b0d5983eb0c53fb8696bda3ba035ad2acd6802"

BBCLASSEXTEND="native"
