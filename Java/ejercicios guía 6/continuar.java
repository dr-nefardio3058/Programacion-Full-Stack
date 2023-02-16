package javaapplication33;

import java.util.Scanner;

public class continuar {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String respuesta = "S";
        
        while ("S".equalsIgnoreCase(respuesta)) {
            
            System.out.println("continue?");
            respuesta = leer.next();
            
            
        }
        
        
    }
}