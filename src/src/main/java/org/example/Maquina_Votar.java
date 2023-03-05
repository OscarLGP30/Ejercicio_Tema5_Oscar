package org.example;

public class Maquina_Votar {

    //Cree un algoritmo que pida a los usuarios que voten (los usuarios se turnarán para usar su máquina de votación). Se proponen varios candidatos. Al final del día, el presidente de la mesa de votación introduce un código especial para finalizar la votación (68753421) y se muestran los resultados. Eso sí, este ejercicio es teórico, ya que la seguridad no está garantizada y un usuario puede votar varias veces.

    public static void main(String[] args) {
        int[] tabla = new int[5];
        int i;
        int voto;
        for (i = 0; i < 5; i++) {
            tabla[i] = 0;
        }
        do {
            System.out.println("Introduzca su voto (1-5) o 68753421 para finalizar");
            voto = Maquina_Votar.entero();
            if (voto >= 1 && voto <= 5) {
                tabla[voto - 1]++;
            }
        } while (voto != 68753421);
        for (i = 0; i < 5; i++) {
            System.out.println("El candidato " + (i + 1) + " ha obtenido " + tabla[i] + " votos");
        }
    }

    private static int entero() {

            int numero = 0;
            boolean error = true;
            do {
                try {
                    numero = Integer.parseInt(Maquina_Votar.cadena());
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
