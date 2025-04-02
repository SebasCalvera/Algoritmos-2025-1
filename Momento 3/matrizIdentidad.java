import java.util.Scanner;
public class matrizIdentidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroN = 0;

        System.out.print("Ingrese el tamaño de la matriz:");
        numeroN = scanner.nextInt();
        int[][] matrizIdentidad = new int [numeroN][numeroN];
        scanner.close();            

        for(int fila = 0; fila < numeroN ;fila++){
            for(int col = 0; col < numeroN ;col++){
                if (fila == col) {matrizIdentidad[fila][col] = 1;     
                } else {matrizIdentidad[fila][col] = 0;}
            }
        }
        System.out.println("La matriz identidad es:");
        for(int fila = 0; fila < numeroN ;fila++){
            for(int col = 0; col < numeroN ;col++){
                System.out.print(matrizIdentidad[fila][col] + " ");}
                System.out.println();}
            }    
}
