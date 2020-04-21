SUMMARY = "UI made easy"
DESCRIPTION = "Term::UI provides methods to ask both elaborate questions as \
well as simple yes/no questions via a Term::ReadLine interface using a \
template. It can also parse options per unix style."
SECTION = "libs"
LICENSE = "Artistic-1.0"

LIC_FILES_CHKSUM = "file://README;beginline=31;endline=36;md5=722b591573eae09d26997366cd63125d"
SRC_URI = "https://cpan.metacpan.org/authors/id/B/BI/BINGOS/Term-UI-${PV}.tar.gz"

S = "${WORKDIR}/Term-UI-${PV}"

inherit cpan

RDEPENDS_${PN} += "perl-module-if libterm-readline-perl \
	liblog-message-simple-perl"

SRC_URI[md5sum] = "eaa9240bc44e18dfe558286eb1f3c592"
SRC_URI[sha256sum] = "91946c80d7f4aab0ca4bfedc3bbe0a75b37cab1a29bd7bca3b3b7456d417e9a6"

BBCLASSEXTEND="native"
