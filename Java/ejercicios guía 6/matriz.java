public static void main(String[] args) {
        Random rand = new Random();
        int filas = 4;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];

        // Rellenar la matriz con valores aleatorios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt(10); //(del valor 0 hasta el 10)
            }
        }
        // Mostrar la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " "); //Imprime los números asignados a la matriz, separando cada uno con espacio.
            }
            System.out.println(""); //Espacios 

        }
        // Calcular y mostrar la matriz traspuesta
        System.out.println("\nMatriz traspuesta:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[j][i] + " "); //Imprime los números asignados a la matriz, separando cada uno con espacio.
            }
            System.out.println(""); //Espacios 
        }
        
    }

}
