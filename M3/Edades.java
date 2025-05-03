package M3;

import java.util.Scanner;

public class Edades {
  public static void main(String[] args) {
    
    mostrarInstrucciones();
    leerYClasificarEdades();
  
}  
 public static void mostrarInstrucciones(){

    System.out.println("Este programa pide ingresar edades y las clasifica como 'Menor de edad' o 'Mayor de edad'.");
    System.out.println("Para finalizar el programa, ingrese el número 0.");
}
public static void leerYClasificarEdades(){
 Scanner sc = new Scanner(System.in);
    int edad;

    System.out.println( "Ingrese edad: ");
    edad = sc.nextInt();

    while (edad != 0) {

        if (edad < 18) {
            System.out.println(" Es menos de edad");
        } else {
            System.out.println( " Es mayor de edad");
        }

        System.out.println( " Ingrese otra edad o 0 para finalizar el programa: ");
        edad = sc.nextInt();

       
    }
    System.out.println( " Programa Finalizado");

    sc.close();


} 

}


