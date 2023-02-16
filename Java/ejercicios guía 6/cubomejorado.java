package javaapplication52;

import java.util.Scanner;

public class cubo {

    public static void main(String[] args) {

try (Scanner leer = new Scanner(System.in).useDelimiter("\n")) {
    System.out.println("Ingrese el tamaño del cubo");
    int tamaño = leer.nextInt();
    
    if(tamaño >= 0 && tamaño<=50) {
        
    
    for (int i = 0; i < tamaño-1; i++) {
        System.out.print("*");
            
        }
    
      for (int i = 0; i < tamaño-1; i++) {
        System.out.println("*");
            
        
        for (int j = 0; j < tamaño-1; j++) {
            System.out.print("*");
       }
        }     
      System.out.print("*");
      
    } else {
        System.out.println("Error: El dato a ingresar de estar entre 0 y 50");
   
    }
}
    }
    }



      
        
    
    
    
    
    
       
    


    



/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*�?. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * **/