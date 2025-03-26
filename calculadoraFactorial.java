import java.util.Scanner;

public class calculadoraFactorial {
public static void main(String[] args) {
        int numA = 0, numB = 0;
        long numFactorial = 1;
        int varControl = 0;
        int i = 1;
        long factorial = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenidos");

        while (varControl != 6) {
            System.out.println("1. Sumar dos números\r\n" + //
                    "2. Restar dos números\r\n" + //
                    "3. Multiplicar dos números\r\n" + //
                    "4. Dividir dos números\r\n" + //
                    "5. Factorial de un número\r\n" + //
                    "6. Salir\r\n");
                                                
            System.out.print("Opción seleccionada: ");
            varControl = scanner.nextInt();

            switch (varControl) {
                case 1:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();

                    System.out.println(numA + " + " + numB + " = " + (numA + numB));

                    break;
                case 2:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();

                    System.out.println(numA + " - " + numB + " = " + (numA - numB));

                    break;
                case 3:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();

                    System.out.println(numA + " * " + numB + " = " + (numA * numB));

                    break;
                case 4:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();

                    System.out.println(numA + " / " + numB + " = " + (numA / numB));

                    break;
                case 5: 
                    System.out.print("Ingrese el número al que desea conocer el factorial:  ");
                    numFactorial = scanner.nextLong();

                    while ( i <= numFactorial ) { factorial *= i; i++;}
                    
                    System.out.println( factorial );

                    
                    break;

                case 6:
                    System.out.println("Gracias, hasta pronto!");

                    break;

                default:
                    System.out.println("Opción no valida!");
                    break;
            }

        }

        scanner.close();
    }
}
