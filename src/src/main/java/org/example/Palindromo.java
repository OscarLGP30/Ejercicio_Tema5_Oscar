package org.example;

public class Palindromo {

    //Escriba un algoritmo que pida al usuario una palabra sin acento, en minúsculas y seguida de un carácter en particular para indicar el final (# por ejemplo), y que le diga al usuario si esta palabra es un palíndromo. Un palíndromo es una palabra que se lee igual de izquierda a derecha que de derecha a izquierda. Por ejemplo, "oso" es un palíndromo, pero "oso " no lo es. El carácter de finalización no debe formar parte de la palabra. Por ejemplo, si el usuario introduce "oso#", el programa debe decir que es un palíndromo, pero si introduce "oso #", el programa debe decir que no es un palíndromo. El caracter de finalizcion sera #.

    public static void main(String[] args) {
        String palabra;
        int i;
        boolean palindromo = true;
        System.out.println("Introduzca una palabra sin acento, en minúsculas.");
        palabra = Palindromo.cadena();
        for (i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
                palindromo = false;
            }
        }
        if (palindromo) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
    }

    private static String cadena() {
        String cadena = "";
        try {
            cadena = new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).readLine();
        } catch (java.io.IOException e) {
            System.out.println("Error de entrada/salida");
        }
        return cadena;
    }
}
