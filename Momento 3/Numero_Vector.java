import java.util.Scanner;

public class Numero_Vector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int NumeroBuscar = 0;
        boolean encontrado = false;

        System.out.println( " INGRESA 10 NUMEROS PARA EL VECTOR: ");
        for (int i = 0; i < 10; i++) {

        System.out.println( " Numero "+ (i + 1)+  " : ");
            numeros[i] = sc.nextInt();


        System.out.println( " INGRESE EL NUMERO A BUSCAR: ");
        NumeroBuscar = sc.nextInt();

        }
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == NumeroBuscar ) {
                 encontrado = true;
                
            }
        }
        if (encontrado) {
            System.out.println( "El numero " + NumeroBuscar + " fue encontrado en el vector" );
        } else {
           System.out.println( " El numero "+ NumeroBuscar + " no esta en el vector"); 
        }

             sc.close();
        }

    
        
    }
