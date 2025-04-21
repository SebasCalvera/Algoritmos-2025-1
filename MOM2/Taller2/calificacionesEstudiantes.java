package TallerCiclos;
import java.util.Scanner;
public class calificacionesEstudiantes {
    public static void main(String[] args) {
        //Creación escaner para leer los datos indicados por el usuario//
        Scanner scanner =  new Scanner(System.in);

        //Variables de colores//
        final String VERDE = "\u001B[32m";
        final String ROJO = "\u001B[31m";
        final String RESET = "\u001B[0m";

        //Variables para la cantidad de estudiantes, cuantos aprobaron o reprobaron y para guardar a cada uno su estado(analisis)//
        int estudiantes = 0, aprobados = 0, reprobados = 0;
        String analisis = " ";
        //Solicitar la cantidad de alumnos y leerlo//
        System.out.print("Ingrese la cantidad de estudiantes de la clase:");
        estudiantes = scanner.nextInt();
        scanner.nextLine();
        
        //Crear la matriz para notas y los vectores segun la cantidad de estudiantes indicados//
        double notas [][] = new double [estudiantes][3]; 
        String nombres[] = new String [estudiantes];
        double promedios [] =  new double [estudiantes];

        //Ciclo para pedir el nombre y las calificaciones de cada estudiante.Almacenamos los datos//
        for(int fila =0 ; fila<estudiantes ; fila++ ){
            System.out.print("Ingrese el nombre del estudiante" + " " + (fila+1) + ":");
            nombres [fila] = scanner.nextLine();
            for( int col = 0; col<3; col++){
                System.out.print("Ingrese la calificacion " + " " + (col+1) + " " +  "del estudiante" + " " + nombres [fila]+":");
                notas [fila][col] = scanner.nextDouble();}
                scanner.nextLine();}
        //Ciclo para realizar el promedio de cada estudiante//
        for(int fila =0 ; fila<estudiantes ; fila++ ){
            int suma = 0;
            for( int col = 0; col<3; col++){
                suma += notas [fila][col];} 
                int promedio = suma / 3; 
                promedios [fila] = promedio;
                //Condicional para conocer el estado del estudiante//
                if (promedio >= 60) {analisis = VERDE + "Aprobó" + RESET;} else {analisis = ROJO + "Reprobó" + RESET;}
    
                //Ternario para aplicar espacios para imprimir el reporte mas organizado//
                String tabs = nombres[fila].length() < 7 ? "\t\t" : "\t" ;  
                String tabs2 = String.valueOf(promedio).length() < 3 ? "\t" : "" ;         
                //Imprimir resultado//
                System.out.println("Nombre: " + " " + nombres[fila] + tabs + " "+ "Promedio: " + " " + promedio + " " + tabs2 + analisis);
        //Condicional para conocer la cantidad de estudiantes en cada dato (aporbado)(reporbado)//
        if (promedio >= 60) {aprobados ++;} else {reprobados++;}
    
    scanner.close(); }
    //Imprimir resultados finales//
    System.out.println("Estudiantes" + VERDE + " " + "aprobados" +": \t" + aprobados + RESET);
    System.out.println("Estudiantes" + ROJO + " " +"reprobados" + ":" + " " + reprobados + RESET);
        }
    }
//Fin de la clase y ejercicio califiacionesEstudiantes//