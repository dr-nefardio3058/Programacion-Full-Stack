package vocal;

import java.util.Scanner;

public class Vocal {

    public static void main(String[] args) {

Scanner leer = new Scanner(System.in).useDelimiter("\n");

    char c;
        String r="";
        Scanner teclado=new Scanner (System.in);
        System.out.println("Ingrese letra y le diré si es una vocal");
        c=teclado.next(). charAt(0); /*transforma a caracter*/
        
        r = "NO ES VOCAL";
        
        if (c=='a' || c=='A'){
            r= c +" ES UNA VOCAL";
        }
        if (c=='e' ||c=='E'){
            r=c +" ES UNA VOCAL";
        }
        if (c=='i' ||c=='I'){
           r=c +" ES UNA VOCAL";
        }
        if (c=='o' ||c=='O'){
            r=c +" ES UNA VOCAL";
        }
        if (c=='u' ||c=='U'){
            r=c +" ES UNA VOCAL";
        }
        System.out.println("");
        System.out.println(" Resultado: " + r);
        }
                
    }

    
