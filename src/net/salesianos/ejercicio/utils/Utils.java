package net.salesianos.ejercicio.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utils {
    public static String textObtainer(){
        String TEXT_ROUTE = "./src/net/salesianos/ejercicio/input/lorem_ipsum.txt";
        String text = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(TEXT_ROUTE));
            String line = bufferedReader.readLine();
            while(line != null){
                text += line.toLowerCase();
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            return text;
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void vowelPrinter(File outputFile, String[] vowels){
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(outputFile));
            String line = bufferedReader2.readLine();
            int vowelcount = 0;
            for (String vowel : vowels) {
                if (line != null) {
                    System.out.println("Text has " + line + " vowels " + vowel);
                    vowelcount += conversorLine(line);
                    line = bufferedReader2.readLine();
                }
            }
            System.out.println("Total vowels: " + vowelcount);
            bufferedReader2.close();
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static Integer conversorLine(String line){
        try {
            return Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
