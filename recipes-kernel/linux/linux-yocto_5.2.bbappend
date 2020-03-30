FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "file://defconfig"


# KBUILD_DEFCONFIG_s5pv210 ?= "s5pv210_defconfig"
COMPATIBLE_MACHINE = "s5pv210"

# this is madness (source https://stackoverflow.com/questions/48441494/kbuild-defconfig-kmachine-defconfig-file-does-not-work-as-expected)
# what's the point of KBUILD_DEFCONFIG if doesn't create a usable .config?
KCONFIG_MODE = "--alldefconfig"
