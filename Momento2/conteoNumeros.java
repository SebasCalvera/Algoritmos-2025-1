package Ciclos;
import java.util.Scanner;

public class conteoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++)
        {System.out.print("Ingrese el número" + " " + i +":");
        numero = scanner.nextInt();
        if (numero % 2 == 0){pares++;}
        else {impares++;}}

        System.out.println("La cantidad de números pares ingresados es" + " " + pares);
        System.out.println("La cantidad de números impares ingresados es" + " " + impares);
        
        scanner.close();    
    }    
}
