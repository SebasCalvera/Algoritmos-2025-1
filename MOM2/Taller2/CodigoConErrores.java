import java.util.Scanner;

public class TorneoPuntuaciones {

    public static void main(String[] args) {
        // Declarar vector para 5 puntuaciones
        int[] puntuaciones = new int[5];
        int puntuacionMaxima = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese las 5 puntuaciones de los jugadores:");

        // Ciclo para ingresar puntuaciones
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.print("Puntuacion Jugador " + (i + 1) + ": ");
            puntuaciones[i] = teclado.nextInt();

            // Comprobar si es la puntuación máxima
            if (puntuaciones[i] > puntuacionMaxima) {
                puntuacionMaxima = puntuaciones[i];
            }
        }

        // Mostrar puntuaciones (bucle while corregido)
        System.out.println("\nPuntuaciones ingresadas:");
        int k = 0;

        // ERROR ORIGINAL:
        
      // while (k = puntuaciones.length) { ... }
        // → Esto es una asignación (=) en vez de una comparación (<)
        // → Además, no se incrementaba 'k', lo que causaría un bucle infinito
        //
        // CORREGIDO:
        
      while (k < puntuaciones.length) {
            System.out.println(puntuaciones[k]);
            k++;  // importante incrementar para evitar bucle infinito
        }

        // Mostrar puntuación máxima
        System.out.println("\nLa puntuación máxima fue: " + puntuacionMaxima);
    }
 teclado.close();
}
