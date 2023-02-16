package ejercicioswitch;

import java.util.Scanner;

public class Ejercicioswitch {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese tipo de motor (1-4)");
        int num = leer.nextInt();
        
        switch (num) {
            case 1: 
                System.out.println("La bomba es una bomba de agua");
                break;
                
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
                
            case 3: 
                System.out.println("La bomba es una bomba de hormigón");
                break;
                
            case 4: 
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
                
            case 69:
                System.out.println("pene rico");
                break;
                
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
        System.out.println("Fin del programa.");
    }
}

/*Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta
alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
válido para tipo de bomba*/