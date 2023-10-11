package net.salesianos.ejercicio;

import java.io.File;
import java.util.ArrayList;

import net.salesianos.ejercicio.launcher.ProcessLauncher;
import net.salesianos.ejercicio.utils.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        File outputFile = ProcessLauncher.OUTPUT_FILE;
        String[] VOWELS = {"a", "e", "i", "o", "u"};
        ArrayList<Process> allProcesses = new ArrayList<>();

        for (String vowel : VOWELS) {
            Process subprocesses = ProcessLauncher.initVowelProcess(vowel);
            allProcesses.add(subprocesses);
        }
        for (Process process : allProcesses) {
            try {
                process.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Utils.textObtainer();
        Utils.vowelPrinter(outputFile, VOWELS);
    }
}
