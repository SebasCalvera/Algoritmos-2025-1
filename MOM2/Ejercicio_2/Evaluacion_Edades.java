package Momento2;

import java.util.Scanner;

public class Evaluacion_Edades {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int edad = 0; // Variable para almacenar la edad ingresada
        int menores = 0; // Contador de personas menores de edad (< 18 años)
        int mayores = 0; // Contador de personas mayores de edad (>= 18 años)

        System.out.println("Ingrese las edades (ingrese un número negativo para finalizar):");
        edad = sc.nextInt(); 

        while (edad >= 0) {  // El ciclo se ejecuta mientras la edad sea positiva o cero
            
            if (edad < 18) {
                menores++;  // Suma al contador de menores de edad
            
            } else {
                mayores++; // Suma al contador de mayores de edad
            }

    
        }

        System.out.println("Cantidad de personas menores de edad: " + menores);
        System.out.println("Cantidad de personas mayores de edad: " + mayores);

        sc.close();
    }
}
