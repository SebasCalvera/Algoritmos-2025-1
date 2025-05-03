package M3;

import java.util.Scanner;

public class Positivos {

    static int contador = 0;
    public static void main(String[] args) {
        
        Instrucciones();
        LeerContarNumeros();
    }
        public static void Instrucciones(){
           
            System.out.println("Este programa pide ingresar números enteros.");
            System.out.println("Contará cuántos de los números ingresados son positivos.");
            System.out.println("Para finalizar el programa ingrese el número -1.");
        }

        public static void LeerContarNumeros(){
            Scanner sc = new Scanner( System.in);

            int numIngresado;

            System.out.println("Ingrese un numero: ");
            numIngresado = sc.nextInt();
            
            while (numIngresado != -1) {
                if (numIngresado > -1) {
                    contador++;
                    System.out.println();
                } else {
                   System.out.println("Ingrese otro número o -1 para terminar: "); 
                   numIngresado = sc.nextInt();
                }

                System.out.println("Se ingresaron " + contador + " números positivos.");
                sc.close();
            }
            
        }


    }
