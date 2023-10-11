package net.salesianos.ejercicio.launcher;

import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import net.salesianos.ejercicio.utils.Utils;

public class ProcessLauncher {
    public static final String OUTPUT_ROUTE = "./src/net/salesianos/ejercicio/outputs/cositas.txt";
    public static final String COUNTER_ROUTE = "./src/net/salesianos/ejercicio/processes/CharCounter.java";
    public static final String TEXT = Utils.textObtainer();
    public static final File OUTPUT_FILE = new File(OUTPUT_ROUTE);
    public static Process initVowelProcess(String vowel){
        ProcessBuilder processBuilder = new ProcessBuilder(
            "java", COUNTER_ROUTE, vowel, TEXT
        );
        Process javaProcess = null;
        try {
            processBuilder.redirectOutput(Redirect.appendTo(OUTPUT_FILE));
            javaProcess = processBuilder.start();
            return javaProcess;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
