package Ciclos;
import java.util.Scanner;
public class conteoNumeros {
    public static void main(String[] args) {
        //Creación scanner para leer los números ingresados de manera externa por el usuario//
        Scanner scanner = new Scanner(System.in);

        int numero = 0;  //Variable para almacenar el número ingresado por el usuario//
        int pares = 0;   //Variable para almacenar la cantidad de números pares//
        int impares = 0; //Variable para almacenar la cantidad de números impares//

        //Ciclo para pedir los 10 números y clasificarlos en pares o impares según el resultado del if//
        for (int i = 1; i <= 10; i++)
        {System.out.print("Ingrese el número" + " " + i +":");
        numero = scanner.nextInt();
        if (numero % 2 == 0){pares++;}
        else {impares++;}}

        //Finalizado el ciclo con los 10 números damos los resultados//
        System.out.println("La cantidad de números pares ingresados es" + " " + pares);
        System.out.println("La cantidad de números impares ingresados es" + " " + impares);
        //Despedimos al usuario por cortesia//
        System.out.println("Hasta pronto! Gracias por usar el programa!");
        
        scanner.close();    
    }    
}
//Fin de la clase y ejercicio conteoNumeros//