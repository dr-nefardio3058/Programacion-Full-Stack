/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author nefardio
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese temperatura a convertir C°");
        
        float temp = leer.nextFloat();
        
        float tempq = 32+(9*temp/5);
        
        System.out.println("La temperatura " +temp + "C° equivale a " + tempq + " F ");
        
        
                
    }
    
}
