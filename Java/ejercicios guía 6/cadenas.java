package javaapplication51;

import java.util.Scanner;

public class cadenas {

    public static void main(String[] args) {

Scanner leer = new Scanner(System.in).useDelimiter("\n");

int correcta, incorrecta;
        correcta=0;
        incorrecta=0;
        String cadena;
        
        System.out.println("ingrese una cadena de 5 caracters, el primer caracter tiene que ser x y la última una o; de caso contrario, la cadena contará como incorrecta");
        cadena = leer.nextLine();
        
      while(!cadena.equals("&&&&&")){
          int longitud = cadena.length();
          
          if( cadena.substring(0,1).equalsIgnoreCase("x") && (cadena.endsWith("o")) && (longitud==5)){
              correcta++;
              
          }else{
              incorrecta++;
          }
         
          cadena = leer.nextLine();
          
          
      }
      System.out.println("Cadenas correctas:"+correcta);
      System.out.println("Cadena incorrectas:"+incorrecta);     
    }
    
}

    
