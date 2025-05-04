package M3;

import java.util.Scanner;

public class AdivinaNum {
    static int NumSecreto = 19;//int numeroSecreto = (int) (Math.random()*100)+1//
    public static void main(String[] args) {
        
        Instrucciones();
        Juego();
    }
        public static void Instrucciones(){

            System.out.println("Bienvenido al juego de adivinar el número secreto");
            System.out.println("He pensado en un número entre 1 y 20");
            System.out.println("Intenta adivinar cuál es.");
    
        }

        public static void Juego() {
            Scanner sc = new Scanner (System.in);
            int intento;
            int intentoshechos = 0;
            boolean correcto = false;

            while (!correcto) {
                System.out.println(" Ingresa el numero: ");
                intento = sc.nextInt();
                intentoshechos++;

                if ( intento < NumSecreto){
                    System.out.println( "Demasiado bajo Intenta de nuevo");
                } else if (intento > NumSecreto) {
                    System.out.println( "Demasiado alto Intenta de nuevo");
                }
                    else{
                System.out.println("Adivinaste el número secreto (" + NumSecreto + ") en " + intentoshechos + " intentos");
                      correcto = true;
                    }
                


            }
    sc.close();
}

    
}
