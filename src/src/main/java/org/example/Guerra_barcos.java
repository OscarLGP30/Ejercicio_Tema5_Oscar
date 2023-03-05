package org.example;

public class Guerra_barcos {

    //Realizar un algoritmo que permita jugar a los barcos con las siguientes simplificaciones: solo hay un jugador, solo hay cuatro filas y cuatro columnas y solo hay un barco que ocupa una unica celda (este barco se colocará de forma aleatoria). El jugador introduce las coordenadas de una celda y el programa le dice si ha tocado o no el barco. El juego termina cuando el jugador acierta el barco.

public static void main(String[] args) {
        int[][] tablero = new int[4][4];
        int fila;
        int columna;
        int i;
        int j;
        int barco_fila;
        int barco_columna;
        boolean tocado = false;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                tablero[i][j] = 0;
            }
        }
        barco_fila = (int) (Math.random() * 4);
        barco_columna = (int) (Math.random() * 4);
        do {
            System.out.println("Introduzca la fila");
            fila = Guerra_barcos.entero();
            System.out.println("Introduzca la columna");
            columna = Guerra_barcos.entero();
            if (fila == barco_fila && columna == barco_columna) {
                tocado = true;
            }
        } while (!tocado);
        System.out.println("Has tocado el barco");
    }

    private static int entero() {

            int numero = 0;
            boolean error = true;
            do {
                try {
                    numero = Integer.parseInt(Guerra_barcos.cadena());
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
