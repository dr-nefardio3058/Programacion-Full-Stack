/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author nefardio
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String contra;
        
        
        System.out.println("Ingrese contraseña");
        contra = leer.next();
        
        if ("eureka".equals(contra))
            
            System.out.println("Accedió al sistema");
        
       else
        
        System.out.println("No accedió al sistema");
        
    }
    
}
