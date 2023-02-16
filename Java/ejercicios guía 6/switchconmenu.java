package javaapplication46;

import java.util.Scanner;

public class swconmenu {

    public static void main(String[] args) {

Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese dos números enteros positivos");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
            
        System.out.println("Ingrese la opción a ejecutar del 1 al 5");
        int resp = leer.nextInt();
     
        
        switch (resp) {
            case 1:
                System.out.println("La suma de sus números es: "+ num1+num2);
                break;
            case 2:
                System.out.println("La resta entre estos dos números es: "+ (num1-num2));
                break;
            case 3:
                    System.out.println("La multiplicación de estos números da como resultado: "+ num1*num2);
                    break;
            case 4:
                System.out.println("La división entre estos dos números es de: "+ num1/num2);
                break;
            case 5: 
                System.out.println("Salió del sistema, corra denuevo el programa para reiniciar.");
                break;
            default:
                System.out.println("Ingrese un número válido, intente de nuevo reiniciando el programa.");
                break;
        }
        }
    }


/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.*/