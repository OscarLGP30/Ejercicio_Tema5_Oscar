package org.example;

public class Despeje_Inmediato {
    //Crear un algoritmo escribiendo los valores comprendidos entre diez y cero en orden descendente en una tabla, y posteriormente recorrer esta tabla para mostrar la cuenta hacia atrás.

    public static void main(String[] args) {
        int[] tabla = new int[11];
        int i;
        for (i = 0; i < 11; i++) {
            tabla[i] = 10 - i;
        }
        for (i = 0; i < 11; i++) {
            System.out.println(tabla[i]);
        }
    }

    

}
