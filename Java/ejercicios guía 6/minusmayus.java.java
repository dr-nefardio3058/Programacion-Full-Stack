/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author nefardio
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
  Scanner leer = new Scanner(System.in);
  
  
        System.out.println("ingrese palabra para convertirla en todo minsuculas o todo mayus");
  String nombre = leer.next();
        
  String nombre1 = toLowerCase(nombre);
  String nombre2 = toUpperCase (nombre);
  
        System.out.println("la palabra en minusculas es " + nombre1);
  System.out.println("la palabra en mayusculas es " + nombre2);
    }
    
}
