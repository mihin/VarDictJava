package com.astrazeneca.vardict.printers;

import java.io.Serializable;

/**
 * Standard output for variant printer (will print to STDOUT).
 */
public class SystemOutVariantPrinter extends VariantPrinter implements Serializable{
    public SystemOutVariantPrinter() {
        out = System.out;
    }
}
