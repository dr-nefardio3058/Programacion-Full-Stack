package javaapplication62;

import java.util.Scanner;

public class JavaApplication62 {

    public static void main(String[] args) {

Scanner leer = new Scanner(System.in).useDelimiter("\n");

System.out.println("Ingrese un numero entero");
        
        int num = leer.nextInt();
        
        int contador=0;
        
        do {
            num /= 10; //js. divide el numero en 10 y lo agrega al total
            contador++;
            
        } while (num>0);
        
        System.out.print("La cantidad de dígitos es: " + contador);
    }
    
}

    
