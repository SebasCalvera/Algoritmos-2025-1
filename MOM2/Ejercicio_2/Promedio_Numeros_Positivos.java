package Momento2;

import java.util.Scanner;

public class Promedio_Numeros_Positivos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0; // Variable que almacenará el número ingresado por el usuario
        int suma = 0; // Acumulador para la suma de los números positivos
        int contador = 0; // Contador de cuántos números positivos se ingresaron
        

        System.out.println("Ingrese números enteros (ingrese 0 para finalizar):");

        do {
            num = sc.nextInt();
               if (num > 0 ) {  // Si el número es positivo

                suma = suma + num; // Se suma al acumulador
                contador++; // Se incrementa el contador
            }
        } while ( num != 0); // El ciclo se repite hasta que el usuario ingrese 0
  
                
        // Después de salir del ciclo, verificamos si se ingresaron números positivos

               if (contador > 0 ) {
                
                double promedio = suma/contador; // Promediamos
                
                System.out.println("El promedio de los números positivos es: " + promedio);  
           
            }   else {
                
                System.out.println("No se ingresaron números positivos.");
            }  
            
            sc.close();

        }


    }
    

