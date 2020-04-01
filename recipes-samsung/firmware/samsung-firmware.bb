SUMMARY = "Linux kernel firmware files for the Samsung Galaxy S"
DESCRIPTION = "Firmware files for the Samsung Galaxy S \
regarding the chip BCM4329"
# HOMEPAGE = ""
SECTION = "kernel"
LICENSE = "CLOSED"
PR = "r1"

FILESEXTRAPATHS_prepend := "${THISDIR}:"
SRC_URI = "file://bcm4329/BCM4329B1.hcd \
           file://bcm4329/brcmfmac4329-sdio.txt \
"

S = "${WORKDIR}/"

inherit allarch

CLEANBROKEN = "1"

do_compile() {
    :
}

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware/brcm

    cp ${S}/bcm4329/BCM4329B1.hcd ${D}${nonarch_base_libdir}/firmware/brcm/
    cp ${S}/bcm4329/brcmfmac4329-sdio.txt ${D}${nonarch_base_libdir}/firmware/brcm/
}

# PACKAGES = "${PN}"
FILES_${PN} = "${nonarch_base_libdir}/ \
               ${nonarch_base_libdir}/firmware/ \
               ${nonarch_base_libdir}/firmware/bcrm/ \
               ${nonarch_base_libdir}/firmware/bcrm/BCM4329B1.hcd \
               ${nonarch_base_libdir}/firmware/bcrm/brcmfmac4329-sdio.txt \
"
