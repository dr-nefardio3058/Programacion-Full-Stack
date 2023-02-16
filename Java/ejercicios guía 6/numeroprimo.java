package javaapplication63;

import java.util.Scanner;

public class JavaApplication63 {

    public static void main(String[] args) {

Scanner leer = new Scanner(System.in).useDelimiter("\n");

      System.out.println("Ingrese un número para saber si es primo o no");
        int num = leer.nextInt();
        analizar(num);
    }

    public static void analizar(int num) {
        /*if (num%1 ==0 || num%num==0 || num%2==0){
            System.out.println("Es primo");
        }*/
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }

        }
        if (cont == 2) {
            System.out.println("El número ingresado es primo");
        } else {
            System.out.println("El número ingresado no es primo");
        }
    }  
}   

