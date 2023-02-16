package promedioaltura;

import java.util.Scanner;

public class Promedioaltura {

    public static void main(String[] args) {

Scanner leer = new Scanner(System.in).useDelimiter("\n");

            System.out.println("Ingrese la cantidad de personas");

        int N = leer.nextInt();
        int j=0;
        double[] vector = new double[N];
        double suma1 = 0;
        double suma2 = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el valor de la estatura " + (i + 1));
            vector[i] = leer.nextDouble();

        }
        for (int i = 0; i < N; i++) {
            if (vector[i] < 1.60) {
                suma1 = suma1 + vector[i];
                j++;

            }
        }
        if(j==0){
                  System.out.println(" No se ingresaron valores de altura menores a 1,60cm ");
       
        }else{
            System.out.println(" Tu promedio de altura es menor a 1,60cm: " + (suma1 / j) + " metros");
        }
   
     for (int i = 0; i < N; i++) {
            
                suma2 = suma2 + vector[i];
               
            
        }
        System.out.println(" Tu promedio de altura total es: " + (suma2 / N) + " metros");   
    }  
}

    
