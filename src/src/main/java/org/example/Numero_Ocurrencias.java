package org.example;

public class Numero_Ocurrencias {

    //Realizar un algoritmo que haga que el usuario introduzca tantas cifras comprendidas entre cero y nueve como desee. Una vez que el usuario ha terminado su serie introduciendo -1, el algoritmo muestra el número de veces que se ha escrito cada dígito.

    public static void main(String[] args) {
        int[] tabla = new int[10];
        int i;
        int numero;
        for (i = 0; i < 10; i++) {
            tabla[i] = 0;
        }
        do {
            System.out.println("Introduzca un número entre 0 y 9");
            numero = Numero_Ocurrencias.entero();
            if (numero >= 0 && numero <= 9) {
                tabla[numero]++;
            }
        } while (numero != -1);
        for (i = 0; i < 10; i++) {
            System.out.println("El número " + i + " se ha escrito " + tabla[i] + " veces");
        }
    }

    private static int entero() {

        int numero = 0;
        boolean error = true;
        do {
            try {
                numero = Integer.parseInt(Numero_Ocurrencias.cadena());
                error = false;
            } catch (NumberFormatException e) {
                System.out.println("Error, introduzca un número entero");
            }
        } while (error);
        return numero;
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



