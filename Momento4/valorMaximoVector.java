package Ciclos;
import java.util.Scanner;
public class valorMaximoVector {

/*Ejercicio 1: Encuentra el valor máximo y su posición en un vector
Enunciado:
Solicita al usuario ingresar 8 números enteros en un vector. Luego, recorre el vector para
encontrar el número mayor y muestra también su posición dentro del vector.
Temas aplicados:
● Vectores
● Ciclos for
● Condicionales if
● Uso de índices
*/
    public static void main(String[] args) {
        //Creación scanner para leer los 8 numeros ingresadas de manera externa por el usuario//
        Scanner scanner = new Scanner(System.in);
        
        int numeroMayor= 0;                //Variable para almacenar el número mayor del vector//
        int[]numeroVector = new int [8];   //Creación del vector de tipo entero y con 8 espacios//
        int posicionNumeroMayor = -1;      //Variable para almacenar la posicion del numero mayor en el vector//

        //Incio del bucle para pedir los 8 números que componenen el vector ya creado//
        for( int i = 0; i < 8 ; i++ )//Creacion de la variable de contro "i" para que el ciclo finalice despúes de ingresar 8 números y que el contador aumente en cada vuelta//
        {  System.out.print("Ingrese el elemento " + " " + (i+1) +  " " + "del vector: ");//Solicitar ingresar los números//
           numeroVector[i] = scanner.nextInt();}//Leer y almacenar los numeros en el vector en orden//
        
        //Inicio del segundo bucle para recorrer los elementos del vector y comprobar ls condicion//
        for( int i = 0; i < 8 ; i++)//Variable de control "i" para que el ciclo termine despues de leer los 8 numeros//
        {  if( numeroVector[i] > numeroMayor)//Analizar si el número ingresado es el mayor hasta el momento según los ya ingresados//
            {numeroMayor = numeroVector[i]; posicionNumeroMayor = i; }}//En caso de ser verdadero se almacena el número como el mayor y su posición en el vector//
        
        //Usamos el indice "i" como la posición del numero dentro del vector, este indice va cambiando con el paso del ciclo y es unico para cada numero//
        System.out.println("El número mayor es: " + numeroMayor + " " + "en la posición " + posicionNumeroMayor);//Imprimimos el numero mayor y su posicion como resultado//
        //Despedimos al usuario por cortesia//
        System.out.println("Hasta pronto! Gracias por usar el programa!");
        scanner.close();
    }
}
//Fin de la calse y ejercicio valorMaximoVector//