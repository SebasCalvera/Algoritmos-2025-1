package Ciclos;

import java.util.Scanner;

public class juegoAdivinanzas {
    public static void main(String[] args) {
        //Creacion escaner para leer los numeros e indicaciones dadas por el usuario//
        Scanner scanner = new Scanner(System.in);
        
        //Creacion variables del numero secreto, el indicado por el jugador y los datos para el informe//
        int numeroSecreto = (int) (Math.random()*100)+1, numeroJugador = 0, puntuacion = 100, intentos = 1, partidas = 0;
        //Vector para almacenar los puntajes previos//
        int puntuaciones [] = new int[10];
        //Variable para inicar o no el juego//
        boolean partida = false;
  
        //Variables de colores//
        final String VERDE = "\u001B[32m";
        final String ROJO = "\u001B[31m";
        final String RESET = "\u001B[0m";

        //Solicitar iniciar o no el juego//
        System.out.print("Desea iniciar una partida (true=si false=no) : ");
        partida = scanner.nextBoolean();
        
            //Si la solicitud fue inicar, ciclo para jugar//
            while(partida == true){while (intentos < 11) {System.out.print("Adivina el numero: ");
            numeroJugador = scanner.nextInt();
            //Condicional para revisar el numero e indicar lo que corresponde//
            if (numeroJugador == numeroSecreto)
            {System.out.println(VERDE+"GANASTE!" + RESET +"\n Puntuación: " + "\t" + puntuacion +"\n Intentos: "+"\t" + intentos +"\n Número:" + "\t"+ numeroSecreto);
            break;}
            else{if (intentos<10){if(numeroJugador < numeroSecreto) 
                {System.out.println("El número a adivinar es mayor");} else {System.out.println("El número a adivinar es menor");} } 
            
            //Realizar los ajustes a las variables segun las instrucciones//
            puntuacion -= 10;
            intentos ++; }}
            
            //Condicional para determinar si al jugador se le acabaron los intentos//
            if( numeroJugador != numeroSecreto){System.out.println(ROJO + "PERDISTE!" + RESET + "\n Puntuacion: " + "\t" + puntuacion +"\n AGOTASTE LOS INTENTOS!" + "\n El número era:" + "\t" + numeroSecreto);};
            partidas ++;
            //Almacenar la puntuacion//
            puntuaciones[partidas - 1]= puntuacion;
            //Preguntar para iniciar otra vez el juego o no//
            System.out.print("Desea iniciar una partida (true=si false=no) : ");
              partida = scanner.nextBoolean();
        //Reiniciar las variables//
        numeroSecreto = (int) (Math.random()*100)+1; numeroJugador = 0; puntuacion = 100; intentos = 1;}
        
        //Al finalizar el juego imprimir todas las puntuaciones previas//
        System.out.println("HASTA PRONTO!");scanner.close();  
        System.out.println("\nHistorial de puntajes:");
        for (int i = 0; i < partidas; i++) {
            System.out.println("Partida " + (i + 1) + ": " + puntuaciones[i]);};
    }
} 
//Fin de la clase y ejercicio juegoAdivinanzas//
        
        
        
        
        
            




        

    
    

