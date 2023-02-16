package javaapplication45;

import java.util.Scanner;

public class uselesscode {

    public static void main(String[] args) {

Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Igrese un valor limite positivo entero");

        int num = leer.nextInt();
        int suma = 0;
        do {
            System.out.println("Ingres el primer numero ");
            int num2 = leer.nextInt();

            suma = suma + num2;

        } while (num >= suma);

    }
    
}

    