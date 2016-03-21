DESCRIPTION = "Embedded C client for interacting with the IBM Watson Internet of Things Platform"
HOMEPAGE = "https://github.com/ibm-messaging/iotf-embeddedc"
LICENSE = "ECL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30b3836521b3d65bef598bbc358a3afa"

inherit cmake pkgconfig

SRC_URI = "git://github.com/srware/iotf-embeddedc.git;branch=cmake"
SRCREV = "${AUTOREV}"

PR = "r1"

S = "${WORKDIR}/git"

PACKAGES = "${PN} ${PN}-dbg ${PN}-dev"

FILES_${PN} += "${libdir}/*"
FILES_${PN}-dev += "${includedir}/*"
