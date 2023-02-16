package javaapplication61;

import java.util.Scanner;

public class JavaApplication61 {

    public static void main(String[] args) {

Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int num1 = (int) (Math.random()*10); //hasta 10
        int num2 = (int) (Math.random()*10);
        
        System.out.println(num1 + " y " + num2);
        
        int multi = num1 * num2;
        
        System.out.println("Dos numeros enteros entre 1 y 10 han sido generados aleatoriamente");
        System.out.println("Debera adivinar cual es el resultado de su multiplicacion. Tiene dos oportunidades");
        System.out.println("");
        System.out.println("Primer intento. Ingrese un valor entero");
        int resp = leer.nextInt();
        
        if (resp == multi) {
            
            System.out.println("Adivinaste! los numeros eran: " + num1 + "y" + num2);
            
        } else {
            
            System.out.println("Error. Te queda 1 intento. Ingrese un valor entero");
            resp = leer.nextInt();
            
            if (resp == multi) {
            
            System.out.println("Adivinaste! los numeros eran: " + num1 + " y " + num2);
        
        } else {
                
                System.out.println("Lo siento, no has podido adivinar. Los numeros eran: " + num1 + " y " + num2);
                System.out.println("Y el resultado de la multiplicacion era: " + multi);
            }
        
    }
    
}
}

    
