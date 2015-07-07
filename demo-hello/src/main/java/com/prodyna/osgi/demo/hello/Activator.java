package com.prodyna.osgi.demo.hello;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Starting " + bundleContext );
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Starting " + bundleContext );
    }
}
