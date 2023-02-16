/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author cdemarcos
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Escribi el numero 1");
        
        
        int numero1 = leer.nextInt();
        
        System.out.println("Escribi el numero 2");
        
        int numero2 = leer.nextInt();
        
         int suma = numero1 + numero2;
         
         System.out.println("La suma de los numero ingresados es: " + suma );
               
    }
    
}
