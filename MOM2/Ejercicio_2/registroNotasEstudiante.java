package Ciclos;
import java.util.Scanner;
public class registroNotasEstudiante {
    public static void main(String[] args) {
        //Creación scanner para leer las calificaciones ingresadas de manera externa por el profesor//
        Scanner scanner = new Scanner(System.in);
        
        int calificacion = 0; //Variable para almacenar la calificación ingresada//
        int aprobados = 0;    //Variable para almacenar la cantidad de calificaiones >=60//
        int reprobados = 0;   //Variable para almacenar la cantidad de calificaciones <60//
        
        //Solicitar la primera calificación al profesor y leerla//
        System.out.print("Ingrese la calificación (Ingrese -1 para terminar): ");
        calificacion = scanner.nextInt();
        
        //Incio del bucle desde que la calificacion sea diferente a -1//
        while (calificacion != -1)
        //Después de comprobar la calificación determinar si es de aprobados o reprobados y sumar una cantidad a la variable necesaria//
        {if (calificacion >= 60) {aprobados++;}
        else {reprobados ++;}
         //Solicitar la nueva calificación y repetir el ciclo//
         System.out.print("Ingrese la calificación (Ingrese -1 para terminar): ");
         calificacion = scanner.nextInt();}

        //Finalizado el ciclo se muestra la cantidad de aprobados y reprobados según las notas ingresadas//
        System.out.println("Número de estudiantes aprobados: " + aprobados);
        System.out.println("Número de estudiantes reprobados: " + reprobados);
        //Despedimos al profesor por cortesia//
        System.out.println("Hasta pronto profesor!");
        
        scanner.close();
    }    
}
//Fin de la clase y el ejercicio registroNotasEstudiante//
