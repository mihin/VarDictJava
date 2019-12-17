package com.astrazeneca.vardict;

import com.astrazeneca.vardict.data.ReferenceResource;
import org.apache.commons.cli.*;

import java.util.Date;

public class Main {
    /**
     * Method to build options from command line
     * @param args array of arguments from command line
     * @throws ParseException if command line options can't be parsed
     */
    public static void main(String[] args) throws ParseException {
        long start = System.currentTimeMillis();

        Configuration config = new CmdParser().parseParams(args);
        ReferenceResource referenceResource = new ReferenceResource();
        new VarDictLauncher(referenceResource).start(config);

        System.out.println("\nExecuted in: " + (System.currentTimeMillis() - start) + "ms");
    }
}
