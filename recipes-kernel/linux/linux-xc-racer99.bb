require recipes-kernel/linux/linux-yocto.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI  = "git://github.com/xc-racer99/linux.git;branch=all-devices"
SRC_URI += "file://defconfig"

# FIXME: for now is all an ugly hack
SRCREV = "${AUTOREV}"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"
KERNEL_VERSION_SANITY_SKIP = "1"

# KBUILD_DEFCONFIG_s5pv210 ?= "s5pv210_defconfig"
COMPATIBLE_MACHINE = "s5pv210"

# this is madness (source https://stackoverflow.com/questions/48441494/kbuild-defconfig-kmachine-defconfig-file-does-not-work-as-expected)
# what's the point of KBUILD_DEFCONFIG if doesn't create a usable .config?
KCONFIG_MODE = "--alldefconfig"
