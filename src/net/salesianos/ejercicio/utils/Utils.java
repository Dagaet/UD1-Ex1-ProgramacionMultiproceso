package net.salesianos.ejercicio.utils;

import java.io.BufferedReader;
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
}
