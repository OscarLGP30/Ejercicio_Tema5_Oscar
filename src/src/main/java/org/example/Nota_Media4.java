package org.example;

public class Nota_Media4 {

    //Producir un algoritmo agregando notas en una tabla. Al final, mostrar todas las calificaciones y su media.

    public static void main(String[] args) {
        int[] tabla = new int[10];
        int i;
        int suma = 0;
        for (i = 0; i < 10; i++) {
            System.out.println("Introduzca la nota " + (i + 1));
            tabla[i] = Nota_Media4.entero();
            suma = suma + tabla[i];
        }
        for (i = 0; i < 10; i++) {
            System.out.println("La nota " + (i + 1) + " es " + tabla[i]);
        }
        System.out.println("La media es " + (suma / 10));
    }

    private static int entero() {

            int numero = 0;
            boolean error = true;
            do {
                try {
                    numero = Integer.parseInt(Nota_Media4.cadena());
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
