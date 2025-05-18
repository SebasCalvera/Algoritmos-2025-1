package TallerMétodos;

// Unica clase para el Reto 1
import java.util.Scanner;

public class registroPuntuaciones {
    // Usaremos arrays de tamaño fijo para almacenar nombres y puntuaciones.
    // Suponemos un máximo de 5 puntuaciones altas.
    static final int MAX_PUNTUACIONES = 5;
    String[] nombresJugadores = new String[MAX_PUNTUACIONES];
    int[] puntuaciones = new int[MAX_PUNTUACIONES];
    int contadorActual = 0; // Para saber cuántas puntuaciones hemos registrado

    // Método para agregar una nueva puntuación
    // No se preocupará por ordenarlas, solo por registrarlas si hay espacio.
    public void agregarPuntuacion(String nombre, int puntaje) {
        if (contadorActual < MAX_PUNTUACIONES) {
            nombresJugadores[contadorActual] = nombre;
            puntuaciones[contadorActual] = puntaje; // Error: Faltaba ; en las líneas
            contadorActual++; // Error: Faltaba ;
            System.out.println("Puntuación para " + nombre + " " + "registrada.");
        } else {
            System.out.println("Registro lleno. No se pudo agregar la puntuación de " + nombre); // Error: 'nomre' en lugar de 'nombre'
                                                                                                  
        }
        // Error: return innecesario en un método void si es la última línea, pero aquí
        // puede causar confusión.
    }

    // Método para mostrar todas las puntuaciones registradas
    public void mostrarPuntuaciones() {
        System.out.println("\n--- Puntuaciones Más Altas ---");
        if (contadorActual == 0) {
            System.out.println("Aún no hay puntuaciones registradas.");
            // Error: Falta 'return;' si se quiere salir aquí, o quitar el return de
            // agregarPuntuacion
        }
        for (int i = 0; i < contadorActual; i++) { // Error: Condición de bucle incorrecta (debería ser <
                                                   // contadorActual)
            System.out.println(nombresJugadores[i] + ": " + puntuaciones[i] + " puntos");
        }
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        registroPuntuaciones registro = new registroPuntuaciones();
        Scanner teclado = new Scanner(System.in);
        String opcionUsuario = "0";// Error: debería ser String para comparar con "3"
        while (!opcionUsuario.contains("3")) {

            System.out.println("\nSistema de Puntuaciones Arcade");
            System.out.println("1. Agregar Puntuación");
            System.out.println("2. Mostrar Puntuaciones");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcionUsuario = teclado.nextLine();

            switch (opcionUsuario) {
                case "1": // Error: switch con String, pero opcionUsuario es int si no se corrige arriba.
                    if (registro.contadorActual < MAX_PUNTUACIONES) {
                        // Error: MAX_PUNTUACIONES no es accesible directamente sin 'registro.' o
                        // declarándolo static
                        System.out.print("Nombre del jugador: ");
                        String nombreJugador = teclado.nextLine();
                        System.out.print("Puntuación obtenida: ");
                        int puntajeObtenido = teclado.nextInt();
                        teclado.nextLine(); // Limpiar buffer
                        registro.agregarPuntuacion(nombreJugador, puntajeObtenido);
                    } else {
                        System.out.println("El registro de puntuaciones está lleno.");
                    }
                    break;
                case "2":
                    registro.mostrarPuntuaciones();
                    break;
                case "3":
                    System.out.println("Gracias por jugar!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente"); // Error: Falta ;
            }
        }
        teclado.close();
    }
}