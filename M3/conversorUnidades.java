package Métodos;
import java.util.Scanner;
public class conversorUnidades{
    //Creamos el escaner de forma global para usarlo en todos los metodos//
    static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) 
    //Llamamos al metodo menuinteractivo//
    {menuinteractivo();}
    
    //Desarrollamos el metodo interactivo que va a ser llamado por Maim//
    public static void menuinteractivo(){
        //Variable para guardar la opcion indicada//
        int opcion = 0;
        //Ciclo DoWhile proque necesitamos al menos mostrara el menu una vez//
        do {
            //Imprimimos el menu que serian las opcciones de conversion de unidades//
            System.out.println("\n--- CONVERSOR DE UNIDADES ---");
            System.out.println("1. Metros a centimetros");
            System.out.println("2. Kilometros a metros");
            System.out.println("3. Grados celcius a farenheit");
            System.out.println("4. Grados farenheit a celcius");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();//Leemos y guardamos la opcion indicada//
            

            //Desarrollo del switch case proque necesitamos comparar la variable opcion con multiples resultados posibles//
            switch (opcion) {
                case 1:
                //Llamamos al metodo metros a centimetros encargado de la primera opcion de conversion de unidades(metros a centimetros)//
                metroscentimetros();
                break;

                case 2:
                //Llamamos al metodo kilometros a metros encargado de la segunda opcion de conversion de unidades(kilometros a metros)//
                kilometrosmetros();
                break;

                case 3:
                //Llamamos al metodo celcius a farenheit encargado de la tercera opcion de conversion de unidades(grados celcius a farenheit)//
                celciusfarenheit();
                break;

                case 4:
                //Llamamos al metodo farenheit a celcius encargado de la ultima opcion de conversion de unidades(grados farenheit a celcius)//
                farenheitcelcius();
                break;

                case 5:
                //Imprmimos mensaje correspondiente del caso 5 que es salida del programa//
                System.out.print("Saliendo del programa.......  \n Hasta pronto!");
                break;

                default:
                //Indicamos mensaje en caso de no encontrar alguna coincidencia con la opcion ingresada y el menu establecido//
                System.out.print("Opcion no valida intente de nuevo");
            }
        } //Condicion del while para volver a ejecutar la unica manera de salir es con el caso numero 5//
        while (opcion != 5);
    } 
    //Creacion y desarrollo del metodo de la opcion 1, metros a centimetros//
    public static void metroscentimetros() {
        //Solicitamos y leemos el dato necesario que es la cantidad de metros//
        System.out.print("Ingrese la cantidad de metros que desea convertir a centimetros:");
        //Variable para almacenar los metros ingresados//
        double metros = scanner.nextDouble();
        //Realizamos la operacion para hallar la conversion a centimetros y la imprimimos por consola para el usuario//
        double resultado = metros*100;
        System.out.println("Resultado de la conversion de " + metros + " " + "metros a centimetros: " + resultado);
    }
    //Creacion y desarrollo del metodo de la opcion 2, kilometros a metros//
    public static void kilometrosmetros() {
        //Solicitamos y leemos el dato necesario que es la cantidad de kilometros//
        System.out.print("Ingrese la cantidad de kilometros que desea convertir a metros:");
        //Variable para almacenar los kilometros ingresados//
        double kilometros = scanner.nextDouble();
        //Realizamos la operacion para calcular la conversion a metros y mostramos el resultado por consola para el usurario//
        double resultado = kilometros*1000;
        System.out.println("Resultado de la conversion de " + kilometros + " " + "kilometros a metros: " + resultado);
    }
    //Creacion y desarrollo del metodo de la opcion 3, celcius a farenheit//
    public static void celciusfarenheit(){
        //Solicitamos y leemos el dato necesario que son los grados celcius//
        System.out.print("Ingrese los grados celcius que desea converitr a Farenheit:");
        //Variable para almacenar los grados celicus ingresados//
        int celcius = scanner.nextInt();
        //Realizamos la operacion para hallar la conversion a farenheit y la imprimimos por consola para el usuario//
        int resultado = (celcius*9/5) + 32;
        System.out.println("Resultado de la conversion de " + celcius + " " + "grados clecius a farenheit: " + resultado);
    }
    //Creacion y desarrollo del metodo de la opcion 4, farenheit a celcius//
    public static void farenheitcelcius(){
        //Solicitamos y leemos el dato necesario que son los grados farenheit//
        System.out.print("Ingrese los grados farenheit que desea convertir en celcius: ");
        //Variable para almacenar los grados farenheit ingresados//
        int farenheit = scanner.nextInt();
        //Realizamos la operacion para encontrar la conversion a celcius y la imprimimos por consola para el usuario//
        int resultado = (farenheit - 32)*3/5;
        System.out.println("Resultado de la conversion de " + farenheit + " " + "grados farenheit a celcius: " + resultado);
    }
}
//Fin de la clase y ejercicio conversorUnidades//