package TallerMétodos;

import java.util.Scanner;

public class ValidadorCedula {
    //Longitud constante de la cedula para validar
    public static final int LONGITUD = 10;
    //Variable para definir cada condicion de la cedula
    static boolean tieneLetra = false;
    static boolean ceroInicial = false;
    static boolean malLongitud = false;

    /**
     * Valida si las condiciones de la cédula son válidas
     * Las condiciones son:
     * 1. Longitud exacta de 10 numeros
     * 2. Todos los caracteres deben ser numeros
     * 3. No debe inciar por '0'
     * 
     * @param cedula El string de cedula a validar.
     * @return Si la contraseña es valida o no.
     */
    public static boolean esFormatoCedulaValido(String cedula) {
        malLongitud = false;
        tieneLetra = false;
        ceroInicial = false;
        if (cedula.length() != LONGITUD) {
            malLongitud = true;
        }

        for (int i = 0; i < cedula.length(); i++) {
            if (cedula.charAt(i) < '0' || cedula.charAt(i) > '9') {
                tieneLetra = true;
                break;
            }
        }
        if (cedula.charAt(0) == '0') {
            ceroInicial = true;
        }
        if (malLongitud == false && tieneLetra == false && ceroInicial == false) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * Solicita la cedula a validar.
     * Imprime los mensajes decriptivos segun los resultados de esFormatoCedulaValido y 
     * da continuidad o cierre al sistema
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String validador = "";
        System.out.println("--- Sistema Validador de Cédulas ServiTrámitesBogotá ---");
        do {

            System.out.print("Ingrese el número de cédula a validar: ");
            String cedula = scanner.next();
            boolean valida = esFormatoCedulaValido(cedula);
            if (valida) {
                System.out.println("Formato de Cédula VÁLIDO.");
            } else {
                System.out.print("Formato de Cédula INVÁLIDO. (Error: ");
                boolean necesitaY = false;

                if (malLongitud) {
                    System.out.print("longitud incorrecta");
                    necesitaY = true;
                }
                if (tieneLetra) {
                    if (necesitaY)
                        System.out.print(" y ");
                    System.out.print("contiene un no dígito");
                    necesitaY = true;
                }
                if (ceroInicial) {
                    if (necesitaY)
                        System.out.print(" y ");
                    System.out.print("empieza con 0");
                }
                System.out.println(")");
            }
            System.out.print("¿Desea validar otra cédula? (S/N): ");
            validador = scanner.next();
        } while (validador.equals("S"));

        System.out.print("Gracias por usar el sistema");
        scanner.close();
    }
}