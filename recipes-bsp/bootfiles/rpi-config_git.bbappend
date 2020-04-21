do_deploy_append_rpixen() {
    # We need the GIC enabled for Xen to work.
    echo "enable_gic=1" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt

    # If we are using Xen, we are limited to 1GB of RAM at the moment due to 
    # issues with the RPI devices not doing DMA about 1GB and Xen not handling
    # this properly.
    echo "total_mem=1024" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}
