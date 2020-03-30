SRC_URI = "git://github.com/xc-racer99/u-boot-aries.git;branch=v2018.09-aries"

# https://www.yoctoproject.org/docs/2.5.1/dev-manual/dev-manual.html#automatically-incrementing-a-binary-package-revision-number
SRCREV = "${AUTOREV}"
PV = "v2018.09-aries+git${SRCPV}"


LICENSE = "GPL-2+"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
UBOOT_MACHINE ?= "s5p_aries_defconfig"
