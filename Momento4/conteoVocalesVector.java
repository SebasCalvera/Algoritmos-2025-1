package Ciclos;
import java.util.Scanner;
public class conteoVocalesVector {
/*Ejercicio 3: Conteo de vocales en un vector de caracteres
Enunciado:
Crea un vector de 10 caracteres. Pide al usuario que los ingrese uno por uno. Luego,
recorre el vector y cuenta cuántas vocales hay.
Temas aplicados:
● Vectores de tipo char
● Ciclos for
● Condicionales if comparando caracteres
● Contadores */
    public static void main(String[] args) {
        //Creación scanner para leer los caracteres ingresados de manera externa por el usuario//
        Scanner scanner = new Scanner(System.in);

        char[]caracterVector = new char [10];   //Creación del vector de tipo caracter  y con 10 espacios//
        int contadorVocales = 0;                //Variable para almacenar la cantidad de vocales ingresadas por el usuario(contador)//

        //Inicar el ciclo para pedir,alamcenar y leer los 10 caracteres dados por el usuario//
        for(int i=0; i < 10 ;i++)//Creación variable de control para que el ciclo termine despues de haber ingresado 10 caracteres//
        {   System.out.print("Ingrese el caracter" + " " + (i+1) +  " " + "del vector: ");//Pedir los caracteres//
            caracterVector[i] = scanner.next().charAt(0);}//Leer y alamcenar los caracteres en el vector//
            
        //Inicio del ciclo para mirar si el caracter ingresado por el usuario es una vocal, revisamos con mayusculas y minusculas ya que no se especifico cual de las dos ingresaria el usuario//
        for( int i = 0; i < 10; i++)//Se crea variable de control para que el ciclo termine despues de revisar los 10 caracteres//
            //Mirar si el caracter ingresado por el usuario es una vocal, revisamos con mayusculas y minusculas ya que no se especifico cual de las dos ingresaria el usuario//
            {if(caracterVector[i] == 'a' || caracterVector[i] == 'e' || caracterVector[i] == 'i' || caracterVector[i] == 'o' || caracterVector[i] == 'u' ||
               caracterVector[i] == 'A' || caracterVector[i] == 'E' || caracterVector[i] == 'I' || caracterVector[i] == 'O' || caracterVector[i] == 'U')
               {contadorVocales++;}//Si es verdadero la condicion se aumenta una unidad al contador de vocales// 
        }
         System.out.println("El número de vocales ingresadas en el vector es: " + contadorVocales);//Imprimos la cantidad de vocales ingresadas al vector//
         //Despedimos al usuario por cortesia//
         System.out.println("Hasta pronto! Gracias por usar el programa!");
         scanner.close();
    }
}
//Fin de la clase y ejercicio conteoVocalesVector//