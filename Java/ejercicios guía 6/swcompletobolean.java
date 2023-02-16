package introjava;

import java.util.Scanner;

/**
 *
 * @author NICOLAS
 */
public class swcompletobolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
       boolean condicion = false;
        do{ 
        System.out.println("MENU\n" +
                          "1. Sumar\n" +
                          "2. Restar\n" +
                          "3. Multiplicar\n" +
                          "4. Dividir\n" +
                          "5. Salir");
        System.out.println("Por favor elige una opción: ");
        
        
        opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    sumar(); 
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4: 
                    dividir();
                    break;
                case 5: 
                    condicion = salir();
                    break;
            }
        }  while (condicion);
       System.out.println("El programa ha finalizado"); 
    } 

    private static void sumar() {
    Scanner leer = new Scanner(System.in);    
    System.out.println("Ingresa el primer número ");
    int num1 = leer.nextInt();
    System.out.println("Ingresa el segundo número ");
    int num2 = leer.nextInt();
    int suma = num2 + num1;
    System.out.println("La suma es igual a " + suma);
    }

    private static void restar() {
    Scanner leer = new Scanner(System.in);    
    System.out.println("Ingresa el primer número ");
    int num1 = leer.nextInt();
    System.out.println("Ingresa el segundo número ");
    int num2 = leer.nextInt();    
    int multiplicacion = num1*num2;
    System.out.println("La multiplicación es igual a " + multiplicacion);
    }

    private static void multiplicar() {
    Scanner leer = new Scanner(System.in);    
    System.out.println("Ingresa el primer número ");
    int num1 = leer.nextInt();
    System.out.println("Ingresa el segundo número ");
    int num2 = leer.nextInt();   
    int multiplicar = num1*num2;
     System.out.println("La multiplicacion es igual a " + multiplicar);
    }

    private static void dividir() {
    Scanner leer = new Scanner(System.in);    
    System.out.println("Ingresa el primer número ");
    int num1 = leer.nextInt();
    System.out.println("Ingresa el segundo número ");
    int num2 = leer.nextInt();
    int division = num1/num2;
    System.out.println("La división es igual a " + division);
    }

    private static boolean salir() {
    //boolean condicion = false;    
    Scanner leer = new Scanner(System.in);    
     System.out.println("Estas seguro de salir? (S/N");
     String letra = leer.next().toUpperCase();
     //if( letra.equals("S") ){
         
     //condicion = false;
         
    //else {
        // condicion = true;
     
         return letra.equals("N");
         
    } 
    
}