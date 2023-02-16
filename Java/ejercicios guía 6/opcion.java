package javaapplication31;

import java.util.Scanner;

public class opcion {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        System.out.println("opcion");
        int num1 = leer.nextInt();
        
        
        switch (num1) {
            case 1:
                System.out.println("1");
                break;
                
                case 2:
                System.out.println("2");
                break;
                
                default:
                    System.out.println("NADA");
        }
    
    }
}