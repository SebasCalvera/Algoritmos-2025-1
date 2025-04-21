package Ciclos;
import java.util.Scanner;
public class analisisEstadistico {
    public static void main(String[] args) {
        //Creacion escaner para leer los datos indicados por el usuario//
        Scanner scanner = new Scanner(System.in);

        //Creacion matriz para las notas y vector para los nombres de los estudiantes//
        double notasEstudiantes [][] = new double [5][4];
        String nombres[] = new String [5];
        //Variables para el maximo y minimo promedio//
        double maxEstudiante = 0, minEstudiante = 100;
        //Variables para los nombres del mejor y peor estudiante.Variable para el estado de cada estudiante//
        String name = "", minName = "", analisis = "";

        //Variables de colores//
        final String VERDE = "\u001B[32m";
        final String ROJO = "\u001B[31m";
        final String RESET = "\u001B[0m";
        
        //Ciclo para solicitar el nombre y califiaciones de cada estudiante//
        for(int fila =0 ; fila<5 ; fila++ ){
                System.out.print("Ingrese el nombre del estudiante" + " " + (fila+1) + ":");
                nombres [fila] = scanner.nextLine();
                for( int col = 0; col<4; col++){
                    System.out.print("Ingrese la calificacion " + " " + (col+1) + " " +  "del estudiante" + " " + nombres [fila]+":");
                    notasEstudiantes [fila][col] = scanner.nextDouble();}
            scanner.nextLine();}
        //Ciclo para calcular el promedio de cada estudiante//
        for(int fila =0 ; fila<5 ; fila++ ){
            int suma = 0;
            for( int col = 0; col<4; col++){
                suma += notasEstudiantes [fila][col];} 
                int promedio = suma / 4; 
                //Condicional para determinar el estado del estudiante//
                if (promedio >= 60) {analisis = VERDE + "Aprobó" + RESET;} else {analisis = ROJO + "Reprobó" + RESET;}
    
                //Ternario para aplicar espacios para imprimir el reporte mas organizado//
                String tabs = nombres[fila].length() < 7 ? "\t\t" : "\t" ;           
 //Imprimir los resultados de cada estudiante//
 System.out.println("Nombre: " + " " + nombres[fila] + tabs + " "+ "Promedio: " + " " + promedio + " " +"\t" + analisis);
 //Condicional para encontrar el mejor y peor promedio y el nombre de cada estudiante//
 if( promedio > maxEstudiante){maxEstudiante = promedio; name = nombres[fila];}
 else{if (promedio < minEstudiante){minEstudiante = promedio; minName = nombres[fila];}}

scanner.close();};
//Imprimir los resultados faltantes del informe//
System.out.println("Mejor estudiante:" + " " + VERDE + name + RESET + " " + "Promedio:" + " " + VERDE + maxEstudiante + RESET);
System.out.println("Peor  estudiante:" + " " + ROJO + minName + RESET + " " + "Promedio" + " " + ROJO +  minEstudiante + RESET);
    }
}
//Fin de la clase y ejercicio analisisEstadistico//