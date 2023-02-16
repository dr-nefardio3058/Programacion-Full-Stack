/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author nefardio
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingresa un numero entero");
        int numero = leer.nextInt();
        
        if  (0==numero%2){
            System.out.println( numero + " que ingreso es: par "  );
        } else {
            
            System.out.println( numero + " que ingreso es: impar "  );
            
        }

    }
    
}
        
    }
    
}
