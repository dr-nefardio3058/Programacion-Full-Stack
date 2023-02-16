/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author drnefardio
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese num entero");
        
        int numero;
        numero = leer.nextInt();
        
        int doble = numero*2;
        int triple = numero*3;
        double raiz;
        raiz = (int) Math.sqrt(numero);
        
        System.out.println("doble: " + doble);
          System.out.println("triple: " + triple);
            System.out.println("raiz: " + raiz);
    }
    
}
