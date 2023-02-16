package javaapplication44;

import java.util.Scanner;

public class hacermientras {

    public static void main(String[] args) {

Scanner leer = new Scanner(System.in).useDelimiter("\n");

String respuesta = null;

do  {
    
    System.out.println("Desea contuniar?");
respuesta = leer.nextLine();

} while (respuesta.equalsIgnoreCase("S"));
        
    }}
    
