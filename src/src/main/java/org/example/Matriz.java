package org.example;

public class Matriz {

    //Crear una tabla de caracteres bidimensional de tamaño 20×30, en la que se colocan caracteres elegidos al azar. Mostrar la tabla generada.

    public static void main(String[] args) {
        char[][] tabla = new char[20][30];
        int i;
        int j;
        for (i = 0; i < 20; i++) {
            for (j = 0; j < 30; j++) {
                tabla[i][j] = Matriz.caracter();
            }
        }
        for (i = 0; i < 20; i++) {
            for (j = 0; j < 30; j++) {
                System.out.print(tabla[i][j]);
            }
            System.out.println();
        }
    }

    private static char caracter() {
        char caracter = ' ';
        int numero = (int) (Math.random() * 26 + 65);
        caracter = (char) numero;
        return caracter;
    }
}
