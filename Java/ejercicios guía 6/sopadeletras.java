package javaapplication66;

import java.util.Scanner;

public class JavaApplication66 {

    public static void main(String[] args) {

Scanner leer = new Scanner(System.in).useDelimiter("\n");

     String palabra;
        String[][] matriz = new String[20][20];

        int contPalabras = 0;
        //INICIALIZAR MATRIZ
        rellenoDatos(matriz);

        do {
            System.out.println("Ingrese la palabra #" + (contPalabras + 1));
            palabra = leer.next().toUpperCase();

            if (palabra.length() >= 3 && palabra.length() <= 5) {

                insertarPalabra(palabra, matriz);
                contPalabras++;
            } else {
                System.out.println("Palabra incorrecta");
                System.out.println("*****");
            }

        } while (contPalabras < 5);

        rellenarEspacios(matriz);
        mostrarMatriz(matriz);

    }

    public static void rellenoDatos(String[][] arreglo) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                arreglo[i][j] = "*";
            }
        }
    }

    public static void insertarPalabra(String texto, String[][] arreglo) {
        int[] vector=new int[5];

        int indice = (int) (Math.random() * 20 + 1); // PUNTO DE MEJORA PARA QUE NO SE REPITA EL INDICE ASI NO BORRARA EL ANTERIOR
        int indice2 = (int) (Math.random() * 15);
        int letras = texto.length();

        for (int j = 0; j < letras; j++) {
            arreglo[indice][indice2 + j] = texto.substring(j, j + 1);
        }
    }


public static void rellenarEspacios(String[][] arreglo) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (arreglo[i][j].equals("*")) {
                    arreglo[i][j] = String.valueOf((int) (Math.random() * 9 + 1));
                }

            }
        }
    }

    public static void mostrarMatriz(String[][] arreglo) {

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(" " + arreglo[i][j] + " ");
            }
            System.out.println("");
        }

    }
}