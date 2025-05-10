package Métodos;

import java.util.Scanner;

public class contraseña {

    static Scanner scanner = new Scanner(System.in);

    // Constante para la longitud mínima
    private static final int LONGITUD_MINIMA = 8;

    /**
     * Verifica si la contraseña tiene la longitud mínima requerida.
     * 
     * @param password La contraseña a verificar.
     * @return true si la longitud es válida, false en caso contrario.
     */
    public static boolean esLongitudValida(String password) {
        if (password.length() >= LONGITUD_MINIMA) {
            return true;
        } else {
            return false;
        } // Placeholder
    }

    /**
     * Verifica si la contraseña contiene al menos una letra mayúscula.
     * 
     * @param password La contraseña a verificar.
     * @return true si contiene una mayúscula, false en caso contrario.
     */
    public static boolean contieneMayuscula(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {

                return true;
            }
        }
        return false;
    } // Placeholder

    /**
     * Verifica si la contraseña contiene al menos una letra minúscula.
     * 
     * @param password La contraseña a verificar.
     * @return true si contiene una minúscula, false en caso contrario.
     */
    public static boolean contieneMinuscula(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {

                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si la contraseña contiene al menos un dígito.
     * 
     * @param password La contraseña a verificar.
     * @return true si contiene un dígito, false en caso contrario.
     */
    public static boolean contieneDigito(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {

                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si una contraseña es segura según todos los criterios.
     * 
     * @param password La contraseña a verificar.
     * @return true si la contraseña es segura, false en caso contrario.
     */
    public static boolean esContrasenaSegura(String password) {
        return esLongitudValida(password) &&
                contieneMayuscula(password) &&
                contieneMinuscula(password) &&
                contieneDigito(password);
    }

    public static void main(String[] args) {
        String prueba1 = "clave123";
        String prueba2 = "ClaveSegura1";
        String prueba3 = "OTRAMAYUSCULA2";

        System.err.print("Ingrese la contraseña: ");
        String contraseñaUsuario = scanner.nextLine();

        System.out.println("'" + prueba1 + "' es segura? " + esContrasenaSegura(prueba1));
        System.out.println("'" + prueba2 + "' es segura? " + esContrasenaSegura(prueba2));
        System.out.println("'" + prueba3 + "' es segura? " + esContrasenaSegura(prueba3));
        System.out.println("'" + contraseñaUsuario + "' es segura? " + esContrasenaSegura(contraseñaUsuario));

    }
}