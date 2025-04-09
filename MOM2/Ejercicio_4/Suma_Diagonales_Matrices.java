package Momento3;

import java.util.Scanner;

public class Suma_Diagonales_Matrices {
   
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            int n;
            // Pedimos al usuario un tamaño válido para la matriz (máximo 5)
            do {
                System.out.print("Ingrese el tamaño de la matriz menor o igual a 5): ");
                n = sc.nextInt();
            } while (n > 5 || n <= 0); // Validación para asegurarnos que n esté entre 1 y 5
    
            // Creamos una matriz cuadrada de tamaño n x n
            int[][] matriz = new int[n][n];
    
            // Llenamos la matriz con datos ingresados por el usuario
            System.out.println("Ingrese los elementos de la matriz:");
            for (int i = 0; i < n; i++) {           // Recorremos las filas i
                for (int j = 0; j < n; j++) {       // Recorremos las columnas j
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = sc.nextInt(); // Guardamos el valor ingresado en la matriz
                }
            }
    
            // Inicializamos las variables para las sumas de las diagonales
            int sumaDiagonalPrincipal = 0;
            int sumaDiagonalSecundaria = 0;
    
            // Recorremos una sola vez para calcular las diagonales
            for (int i = 0; i < n; i++) {
                sumaDiagonalPrincipal += matriz[i][i];           // Suma de la diagonal principal [i][i]
                sumaDiagonalSecundaria += matriz[i][n - 1 - i];  // Suma de la diagonal secundaria [i][n - 1 - i]
            }
    
            // Mostramos los resultados al usuario
            System.out.println("Suma de la diagonal principal: " + sumaDiagonalPrincipal);
            System.out.println("Suma de la diagonal secundaria: " + sumaDiagonalSecundaria);
    
         
            sc.close();
        }
    }
    