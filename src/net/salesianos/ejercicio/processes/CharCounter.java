package net.salesianos.ejercicio.processes;

public class CharCounter {
    public static void main(String[] args){
        char caracter = args[0].charAt(0);
        String texto = args[1].toLowerCase();
        Integer vowelcount = 0; 
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i)== caracter) {
                vowelcount++;
            }
        }
        System.out.println(vowelcount);
    }
}
