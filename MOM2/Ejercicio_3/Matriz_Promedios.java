import java.util.Scanner;

public class Matriz_Promedios {
    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
        
        
        double[][] notas = new double[3][4]; 
        int suma = 0;
        int promedio = 0 ;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese las notas del estudiante " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota en la asignatura " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble(); 
            }
        }
        
        
        for (int i = 0; i < 3; i++) {
             
            for (int j = 0; j < 4; j++) {
                suma += notas[i][j];
            }
         promedio = suma / 4;
            System.out.println("El promedio del estudiante " + (i + 1) + " es: " + promedio);
        }


        sc.close();
    }
}
    
