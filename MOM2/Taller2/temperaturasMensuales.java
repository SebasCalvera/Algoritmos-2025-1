package TallerCiclos;
import java.util.Scanner;
public class temperaturasMensuales {
    public static void main(String[] args) {
        //Creación escaner para leer los datos indicados por el usuario//
        Scanner scanner = new Scanner(System.in);

        //Variables de colores//
        final String ROJO = "\u001B[31m";
        final String AMARILLO = "\u001B[33m";
        final String AZUL = "\u001B[34m";
        final String RESET = "\u001B[0m";

        //Creacion de vector para almacenar las 30 temperaturas indicadas de cada dia//
        int temperaturas[] = new int [30];
        //Variables para almacenar los datos solicitados para el informe//
        int tempMax = 0, tempMin = 100, sumaTemp = 0, promedio = 0, diasMas25 = 0;
        
        //Ciclo para solicitar las 30 temperaturas diarias y almacenarlas//
        for(int cantidadTemp = 0; cantidadTemp < 30 ; cantidadTemp ++){
            System.out.print("Ingrese la temperatura del día" + " " + (cantidadTemp +1) +":");
            temperaturas [cantidadTemp] = scanner.nextInt();
            //Condicional para determinar temperatura maxima y minima//
            if ( temperaturas [cantidadTemp] > tempMax) {tempMax = temperaturas [cantidadTemp];} 
            else { if (temperaturas [cantidadTemp] < tempMin) {tempMin = temperaturas [cantidadTemp];}}
            //Calcular la suma total de las tempertaurasy posterior su promedio//
            sumaTemp += temperaturas[cantidadTemp];
            //Determinar si la temperatura es mayor a 25 para el dato solicitado//
            if (temperaturas[cantidadTemp] > 25){diasMas25++;}} 
            //Calcular promedio de temperaturas//
            promedio = sumaTemp / 30; 
        
        //Imprimir los resultados finales//
        System.out.println("La temperatura" + " " + ROJO +"máxima" +RESET + " " + "registrada en el mes es: " + "\t" + ROJO + tempMax +"° celsius" + RESET);
        System.out.println("La temperatura" + " " + AZUL + "mínima" + RESET + " " + "registrada en el mes es: " + "\t" + AZUL + tempMin +"° celsius" + RESET);
        System.out.println("La temperatura" + " " + AMARILLO +  "promedio" + RESET + " " + "registrada en el es: " + "\t" + AMARILLO + promedio +"° celsius" + RESET);
        System.out.println("Días que la temperatura fue mayor a 25 grados:" + "\t" + diasMas25);
    scanner.close();
     }
}
//Fin de la calse y ejercicio temperaturasMensuales//