do_deploy_append_rpixen() {
    # We need the GIC enabled for Xen to work.
    echo "enable_gic=1" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}
