package Métodos;
import java.util.Scanner;
public class calculadoraAreasGeometricas{
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
            //Imprimimos el menu que serian las opcciones de calculo de las areas de figuras geometricas//
            System.out.println("\n--- CALCULADORA BÁSICA ---");
            System.out.println("1. Area Cuadrado");
            System.out.println("2. Area Rectangulo");
            System.out.println("3. Area Triangulo");
            System.out.println("4. Area Circulo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();//Leemos y guardamos la opcion indicada//
            

            //Desarrollo del switch case proque necesitamos comparar la variable opcion con multiples resultados posibles//
            switch (opcion) {
                case 1:
                //Llamamos al metodo area del cuadrado encargado de la primera opcion de calculo de area(area del cuadrado)//
                areaCuadrado();
                break;

                case 2:
                //Llamamos al metodo area del rectangulo encargado de la segunda opcion de calculo de area(area del rectangulo)//
                areaRectangulo();
                break;

                case 3:
                //Llamamos al metodo area del triangulo encargado de la tercera opcion de calculo de area(area del triangulo)//
                areaTriangulo();
                break;

                case 4:
                //Llamamos al metodo area del circulo encargado de la ultima opcion de calculo de area(area circulo)//
                areaCirculo();
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
    //Creacion y desarrollo del metodo de la opcion 1, area cuadrado//
    public static void areaCuadrado() {
        //Solicitamos y leemos el dato necesario que es la longitud o medida de uno de los lados del cuadrado//
        System.out.print("Ingrese la longitud de un lado del cuadrado: ");
        //Variable para almacenar la medida del lado ingresada//
        double lado = scanner.nextDouble();
        //Realizamos la operacion para hallar el area del cuadrado y la imprimimos por consola para el usuario//
        double resultado = lado*lado;
        System.out.println("Resultado area del cuadrado: " + resultado);
    }
    //Creacion y desarrollo del metodo de la opcion 2, area rectangulo//
    public static void areaRectangulo() {
        //Solicitamos y leemos el dato necesario que es la longitud o medida de la base y la altura del rectangulo//
        System.out.print("Ingrese la longitud de la base del rectangulo: ");
        //Variable para almacenar la medida de la base ingresada//
        double base = scanner.nextDouble();
        System.out.print("Ingrese la longitud de la altura del rectangulo: ");
        //Varibale para almacenar la medida de la altura ingresada//
        double altura = scanner.nextDouble();
        //Realizamos la operacion para calcular el area del rectangulo y mostramos el resultado por consola para el usurario//
        double resultado = base*altura;
        System.out.println("Resultado area del rectangulo: " + resultado);
    }
    //Creacion y desarrollo del metodo de la opcion 3, area triangulo//
    public static void areaTriangulo(){
        //Solicitamos y leemos el dato necesario que es la longitud o medida de la base y la altura del triangulo//
        System.out.print("Ingrese la longitud de la base del triangulo: ");
        //Variable para almacenar la medida de la base ingresada//
        double base = scanner.nextDouble();
        System.out.print("Ingrese la longitud de la altura del triangulo: ");
        //Variable para almacenar la medida de la altura ingresada//
        double altura = scanner.nextDouble();
        //Realizamos la operacion para hallar el area del triangulo y la imprimimos por consola para el usuario//
        double resultado = (base*altura) / 2;
        System.out.println("Resultado area del triangulo: " + resultado);
    }
    //Creacion y desarrollo del metodo de la opcion 4, area circulo//
    public static void areaCirculo(){
        //Variable de la constante PI,establecida a travez de un llamado de libreria//
        final double PI = Math.PI;
        //Solicitamos y leemos el dato necesario que es la longitud o medida del radio del circulo//
        System.out.print("Ingrese la medida del radio del circulo: ");
        //Variable para almacenar la medida del radio ingresada//
        double radio = scanner.nextDouble();
        //Realizamos la operacion para encontrar el area del circulo y la imprimimos por consola para el usuario//
        double resultado = PI*(Math.pow(radio, 2));
        System.out.println("Resultado area del circulo: " + resultado);
    }
}
//Fin de la clase y ejercicio calculadoraAreasGeometricas//