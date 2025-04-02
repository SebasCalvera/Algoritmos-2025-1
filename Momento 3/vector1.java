import java.util.Scanner;
public class vector1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int elementos = 0;
        int suma =0;
        int[]sumaVector = new int [5];

        for (int i = 0; i < 5; i++){
            System.out.print("Ingrese el elemento" + " " + (i+1) + " " + "del vector: ");
            elementos = sc.nextInt();
            sumaVector [i] = elementos; 
            suma += sumaVector [i];
            
            sc.close();}
        System.out.println("La suma de los elementos del vector es:"+ " "+ suma);
    }
}
