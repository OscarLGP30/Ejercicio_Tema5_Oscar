package org.example;

import java.io.IOException;

public class Registro_Empleados {

    //Los empleados de una cierta compañía se representan en la base de datos de la compañía por su nombre,número de empleado y número de la seguridad social.Construir una estructura de tablas hash que permita acceder al registro de un empleado por cualquiera de estos tres datos.

    public static void main(String[] args) {
        String[] nombre = new String[10];
        int[] numero_empleado = new int[10];
        int[] numero_seguridad_social = new int[10];
        int i;
        int j;
        int opcion;
        int numero;
        int posicion;
        for (i = 0; i < 10; i++) {
            System.out.println("Introduzca el nombre del empleado");
            nombre[i] = Registro_Empleados.cadena();
            System.out.println("Introduzca el número de empleado");
            numero_empleado[i] = Registro_Empleados.entero();
            System.out.println("Introduzca el número de la seguridad social");
            numero_seguridad_social[i] = Registro_Empleados.entero();
        }
        do {
            System.out.println("1. Buscar por nombre");
            System.out.println("2. Buscar por número de empleado");
            System.out.println("3. Buscar por número de la seguridad social");
            System.out.println("4. Salir");
            opcion = Registro_Empleados.entero();
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el nombre del empleado");
                    String nombre_empleado = Registro_Empleados.cadena();
                    posicion = Registro_Empleados.buscar_nombre(nombre_empleado, nombre);
                    if (posicion == -1) {
                        System.out.println("No se ha encontrado el empleado");
                    } else {
                        System.out.println("Nombre: " + nombre[posicion]);
                        System.out.println("Número de empleado: " + numero_empleado[posicion]);
                        System.out.println("Número de la seguridad social: " + numero_seguridad_social[posicion]);
                    }
                    break;
                case 2:
                    System.out.println("Introduzca el número de empleado");
                    numero = Registro_Empleados.entero();
                    posicion = Registro_Empleados.buscar_numero_empleado(numero, numero_empleado);
                    if (posicion == -1) {
                        System.out.println("No se ha encontrado el empleado");
                    } else {
                        System.out.println("Nombre: " + nombre[posicion]);
                        System.out.println("Número de empleado: " + numero_empleado[posicion]);
                        System.out.println("Número de la seguridad social: " + numero_seguridad_social[posicion]);
                    }
                    break;
                case 3:
                    System.out.println("Introduzca el número de la seguridad social");
                    numero = Registro_Empleados.entero();
                    posicion = Registro_Empleados.buscar_numero_seguridad_social(numero, numero_seguridad_social);
                    if (posicion == -1) {
                        System.out.println("No se ha encontrado el empleado");
                    } else {
                        System.out.println("Nombre: " + nombre[posicion]);
                        System.out.println("Número de empleado: " + numero_empleado[posicion]);
                        System.out.println("Número de la seguridad social: " + numero_seguridad_social[posicion]);
                    }
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;


            }
} while (opcion != 4);
    }


    private static int buscar_numero_empleado(int numero, int[] numero_empleado) {
        int i;
        int posicion = -1;
        for (i = 0; i < 10; i++) {
            if (numero == numero_empleado[i]) {
                posicion = i;
            }
        }
        return posicion;
    }

    private static int buscar_numero_seguridad_social(int numero, int[] numero_seguridad_social) {
        int i;
        int posicion = -1;
        for (i = 0; i < 10; i++) {
            if (numero == numero_seguridad_social[i]) {
                posicion = i;
            }
        }
        return posicion;
    }

    private static int buscar_nombre(String nombre_empleado, String[] nombre) {
        int i;
        int posicion = -1;
        for (i = 0; i < 10; i++) {
            if (nombre_empleado.equals(nombre[i])) {
                posicion = i;
            }
        }
        return posicion;
    }

    private static int entero() {
        int numero = 0;
        boolean error;
        do {
            try {
                numero = Integer.parseInt(Registro_Empleados.cadena());
                error = false;
            } catch (NumberFormatException e) {
                System.out.println("Error, introduzca un número");
                error = true;
            }
        } while (error);
        return numero;
    }

    private static String cadena() {
        String cadena = "";
        cadena = Registro_Empleados.readLine();
        return cadena;
    }

    private static String readLine() {
        throw new UnsupportedOperationException("Not supported yet.");


    }
}



