SUMMARY = "Perl implementation of the which utility as an API"
DESCRIPTION = "File::Which finds the full or relative paths to executable \
programs on the system. This is normally the function of which utility. which \
is typically implemented as either a program or a built in shell command. \
On some platforms, such as Microsoft Windows it is not provided as part of the \
core operating system. This module provides a consistent API to this \
functionality regardless of the underlying platform."
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0+"

LIC_FILES_CHKSUM = "file://LICENSE;md5=d4aece164a4cb5012c03e0b99aa7c6a4"
SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/File-Which-${PV}.tar.gz"

S = "${WORKDIR}/File-Which-${PV}"

inherit cpan

SRC_URI[md5sum] = "c8f054534c3c098dd7a0dada60aaae34"
SRC_URI[sha256sum] = "b79dc2244b2d97b6f27167fc3b7799ef61a179040f3abd76ce1e0a3b0bc4e078"

BBCLASSEXTEND="native"
