package matrizmagica;

import java.util.Scanner;

public class Matrizmagica {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

Scanner leer = new Scanner(System.in).useDelimiter("\n");

 int[][] matriz = new int[3][3];
        int fila, columna, diagonal;
    // para rellenar
    System.out.println("Ingrese numeros del 1 al 9");
         for (int i = 0; i < 3; i++) { //entrada matriz fila
            for (int j = 0; j < 3; j++) {//entrada colum
                matriz[i][j] = leer.nextInt();
            
         }}
    // para mostar
    System.out.println("Tus numeros ingresados forman la siguiente matriz");
        for (int i = 0; i < 3; i++) { //entrada matriz fila
            for (int j = 0; j < 3; j++) {//entrada colum
                System.out.print(matriz[i][j] + " ");
            }  System.out.println("");
        }
        fila = (matriz[0][0] + matriz[0][1] + matriz[0][2]);
        columna = (matriz[0][0] + matriz[1][0] + matriz[2][0]);
        diagonal = (matriz[0][0] + matriz[1][1] + matriz[2][2]);
        if (fila == columna && columna == diagonal && fila == diagonal) {
            System.out.println("La matriz en magica");
        } else {
            System.out.println("La matriz NO es magica ");
          }
    }}














    


    
