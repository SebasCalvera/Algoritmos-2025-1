import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = 0, b = 1;

        System.out.println( " Ingrese el numero de digitos de Fibonacci que quiere ver: ");
         int digitos = sc.nextInt();

        System.out.println( "Serie de Fibonacci");


        for ( int contador = 0; contador < digitos; contador++){

        System.out.print(a + " ");

        b = a + b;
        a = b - a;
   
        }



    }
}
