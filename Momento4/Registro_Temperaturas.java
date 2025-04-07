package Momento3;

import java.util.Scanner;

public class Registro_Temperaturas {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Creamos el lector para ingresar datos

    double[] temperaturas = new double[7];  // Creamos un vector de 7 espacios para guardar las temperaturas
    double suma = 0;                        // Aquí vamos a guardar la suma total de las temperaturas
    boolean hayFiebre = false;              // Esta variable nos dirá si alguna temperatura pasó de 38

    // Paso 1: Pedimos al usuario que ingrese las temperaturas de cada día
    for (int i = 0; i < 7; i++) {
        System.out.print("Ingresa la temperatura del día " + (i + 1) + ": ");
        temperaturas[i] = sc.nextDouble();  // Guardamos la temperatura en la posición i
        suma += temperaturas[i];                 // Sumamos esta temperatura al total

        // Verificamos si hay fiebre (temperatura mayor a 38 grados)
        if (temperaturas[i] > 38) {
            hayFiebre = true;  // Activamos la alerta
        }
    }

    // Paso 2: Calculamos el promedio
    double promedio = suma / 7;

    // Paso 3: Mostramos el promedio
    System.out.println("El promedio de temperatura es: " + promedio + "°C");

    // Paso 4: Mostramos alerta si hubo fiebre
    if (hayFiebre) {
        System.out.println("¡Alerta! Se detectó al menos un día con fiebre (más de 38°C).");
    } else {
        System.out.println("No se detectaron temperaturas de fiebre.");
    }
    sc.close();
}

}