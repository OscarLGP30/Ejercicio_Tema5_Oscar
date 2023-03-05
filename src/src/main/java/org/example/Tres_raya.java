package org.example;

public class Tres_raya {

    //Crear un algoritmo para jugar a tres en raya: en una cuadrícula de tres celdas por tres, los jugadores se turnan para escribir su símbolo (X y O) en una celda vacía. El primer jugador que logre alinear (en fila, columna o diagonal) tres de sus símbolos, gana.

    public static void main(String[] args) {
        char[][] tablero = new char[3][3];
        int i;
        int j;
        int fila;
        int columna;
        char jugador = 'X';
        boolean ganador = false;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
        do {
            System.out.println("Jugador " + jugador);
            System.out.println("Introduzca la fila");
            fila = Tres_raya.entero();
            System.out.println("Introduzca la columna");
            columna = Tres_raya.entero();
            tablero[fila][columna] = jugador;
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j]);
                }
                System.out.println();
            }
            if (tablero[0][0] == jugador && tablero[0][1] == jugador && tablero[0][2] == jugador) {
                ganador = true;
            }
            if (tablero[1][0] == jugador && tablero[1][1] == jugador && tablero[1][2] == jugador) {
                ganador = true;
            }
            if (tablero[2][0] == jugador && tablero[2][1] == jugador && tablero[2][2] == jugador) {
                ganador = true;
            }
            if (tablero[0][0] == jugador && tablero[1][0] == jugador && tablero[2][0] == jugador) {
                ganador = true;
            }
            if (tablero[0][1] == jugador && tablero[1][1] == jugador && tablero[2][1] == jugador) {
                ganador = true;
            }
            if (tablero[0][2] == jugador && tablero[1][2] == jugador && tablero[2][2] == jugador) {
                ganador = true;
            }
            if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
                ganador = true;
            }
            if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
                ganador = true;
            }
            if (jugador == 'X') {
                jugador = 'O';
            } else {
                jugador = 'X';
            }
        } while (!ganador);
        System.out.println("Ha ganado el jugador " + jugador);

}

    private static int entero() {
        int numero = 0;
        boolean error = true;
        do {
            try {
                numero = Integer.parseInt(Tres_raya.cadena());
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
