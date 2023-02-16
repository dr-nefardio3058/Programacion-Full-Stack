package javaapplication56;

import java.util.Scanner;

public class cambio {

    public static void main(String[] args) {

Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese cantidad de euros (si es decimal, usar ,");
        double dinero = leer.nextDouble();
        
        System.out.println("MENÚ");
        System.out.println("Conversión a libras");
        System.out.println("Conversión a dólares");
        System.out.println("Conversión a yenes");
        
        System.out.println("Ingrese número del 1-3.");
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println(dinero + "€ equivalen a "+ dinero*0.86 + " libras");
                break;
            case 2:
                System.out.println(dinero + "€ equivalen a " + dinero*1.28611 + " dólares");
                break;
            case 3:
                System.out.println(dinero + "€ equivalen a " + dinero*129.852 + " yenes");
                break;
            default:
                System.out.println("No ingresó un número correcto, reinicie el programa e intente denuevo.");
        }

    }
}

/*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/