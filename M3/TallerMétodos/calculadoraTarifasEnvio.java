package TallerMétodos;

// Unica clase para el Reto 2
import java.util.Scanner;

public class calculadoraTarifasEnvio {
    // Costos base por zona (valores fijos en pesos colombianos)
    public static final double COSTO_BASE_LOCAL = 5000.0;
    public static final double COSTO_BASE_NACIONAL = 15000.0;
    public static final double COSTO_BASE_INTERNACIONAL = 50000.0;
    // Costo adicional por kilogramo (valores fijos en pesos colombianos)
    public static final double COSTO_ADICIONAL_POR_KG_LOCAL = 1000.0;
    public static final double COSTO_ADICIONAL_POR_KG_NACIONAL = 3000.0;
    public static final double COSTO_ADICIONAL_POR_KG_INTERNACIONAL = 10000.0;

    /**
     * Calcula el costo adicional basado en el peso del paquete y la zona.
     * 
     * @param pesoKg El peso del paquete en kilogramos.
     * @param zona   El tipo de zona: 1 para Local, 2 para Nacional, 3 para
     *               Internacional.
     * @return El costo adicional por peso calculado. Si la zona no es válida,
     *         retorna 0.0.
     */
    public static double calcularCostoAdicionalPorPeso(double pesoKg, int zona) {
        double costoAdicional = 0.0;
        // --------- INICIO DE TU CÓDIGO ---------
        if (pesoKg < 0) {
            return 0.0;
        }
        switch (zona) {
            case 1:
                costoAdicional = pesoKg * COSTO_ADICIONAL_POR_KG_LOCAL;
                break;
            case 2:
                costoAdicional = pesoKg * COSTO_ADICIONAL_POR_KG_NACIONAL;
                break;
            case 3:
                costoAdicional = pesoKg * COSTO_ADICIONAL_POR_KG_INTERNACIONAL;
                break;
            default:
                System.out.println("Advertencia: Zona no válida para costo adicional.");
                costoAdicional = 0.0;
                break;
        }
        // --------- FIN DE TU CÓDIGO ---------
        return costoAdicional;
    }

    /**
     * Obtiene el costo base según la zona de envío.
     * 
     * @param zona El tipo de zona: 1 para Local, 2 para Nacional, 3 para
     *             Internacional.
     * @return El costo base correspondiente. Si la zona no es válida, retorna 0.0.
     */
    public static double obtenerCostoBasePorZona(int zona) {
        // --------- INICIO DE TU CÓDIGO ---------
        double costoBase = 0.0;
        switch (zona) {
            case 1:
                costoBase = COSTO_BASE_LOCAL;
                break;
            case 2:
                costoBase = COSTO_BASE_NACIONAL;
                break;
            case 3:
                costoBase = COSTO_BASE_INTERNACIONAL;
                break;
            default:
                System.out.println("Advertencia: Zona no válida para costo base.");
                costoBase = 0.0;

                break;
        }
        return costoBase;
        // --------- FIN DE TU CÓDIGO ---------
    }

    /**
     * Calcula la tarifa total del envío.
     * La tarifa total es la suma del costo base por zona y el costo adicional por
     * peso.
     * 
     * @param pesoKg El peso del paquete en kilogramos.
     * @param zona   El tipo de zona: 1 para Local, 2 para Nacional, 3 para
     *               Internacional.
     * @return La tarifa total calculada.
     */
    public static double calcularTarifaTotal(double pesoKg, int zona) {
        double tarifaTotal = 0.0;
        // --------- INICIO DE TU CÓDIGO ---------
        tarifaTotal = obtenerCostoBasePorZona(zona) + calcularCostoAdicionalPorPeso(pesoKg, zona);
        // --------- FIN DE TU CÓDIGO ---------
        return tarifaTotal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Calculadora de Tarifas de Envío Logística Veloz S.A. ---");
        double pesoPaquete = -1.0;
        // --------- INICIO DE TU CÓDIGO (lectura peso) ---------
        do {
            System.out.print("Ingrese el peso del paquete en kilogramos (ej: 2.5): ");
            pesoPaquete = scanner.nextDouble();
        } while (pesoPaquete <= 0); 
        // --------- FIN DE TU CÓDIGO (lectura peso) ---------
        int zonaEnvio = 0;
        // --------- INICIO DE TU CÓDIGO (lectura zona) ---------
        do {
            System.out.println("Seleccione la zona de envío:");
            System.out.println("1. Local");
            System.out.println("2. Nacional");
            System.out.println("3. Internacional");
            System.out.print("Opción (1-3): ");
            zonaEnvio = scanner.nextInt();
            
        } while (zonaEnvio < 1 
        );
        // --------- FIN DE TU CÓDIGO (lectura zona) ---------
        double tarifaFinal = calcularTarifaTotal(pesoPaquete, zonaEnvio);
        System.out.println("\n--- Detalle del Envío ---");
        System.out.println("Peso del Paquete: " + pesoPaquete + " kg");
        String nombreZona = "";
        switch (zonaEnvio) {
            case 1:
                nombreZona = "Local";
                break;
            case 2:
                nombreZona = "Nacional";
                break;
            case 3:
                nombreZona = "Internacional";
                break;
        }
        System.out.println("Zona de Destino: " + nombreZona);
        System.out.println("Tarifa Total de Envío: $" + String.format("%,.2f", tarifaFinal));
        System.out.println("---------------------------");
        scanner.close();
    }
}