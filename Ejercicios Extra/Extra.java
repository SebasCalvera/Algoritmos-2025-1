package Turridez;

import java.util.Scanner; 

public class Extra {
    public static void main(String[] args) {
        
        String[] nombres = new String[10];  // Vector para almacenar los nombres de los productos
        int[] cantidades = new int[10];      // Vector para almacenar las cantidades de los productos
        double[] precios = new double[10];   // Vector para almacenar los precios de los productos
        
        Scanner scanner = new Scanner(System.in);  
       
        boolean continuar = true;  // Variable para controlar el ciclo del menú
        
        while (continuar) {  // Ciclo do-while para mostrar el menú continuamente
            System.out.println("----- Menú de Inventario -----");
            
            System.out.println("1. Registrar o modificar producto");
            
            System.out.println("2. Buscar producto");
            
            System.out.println("3. Calcular valor total del inventario");
            
            System.out.println("4. Salir");
            
            System.out.print("Elija una opción: ");
            
            int opcion = scanner.nextInt();  // Lee la opción que el usuario elige

            switch (opcion) {
                case 1:  // Opción 1: Registrar o modificar un producto
                    System.out.print("Ingrese el número del producto (0-9): ");
                    int indice = scanner.nextInt();  // Lee el índice del producto (0 a 9)
                    
                    if (indice >= 0 && indice < 10) {  // Valida que el índice esté en el rango adecuado
                        System.out.print("Ingrese el nombre del producto: ");
                        nombres[indice] = scanner.next();  // Asigna el nombre del producto al índice

                        System.out.print("Ingrese la cantidad del producto: ");
                        cantidades[indice] = scanner.nextInt();  // Asigna la cantidad del producto

                        System.out.print("Ingrese el precio del producto: ");
                        precios[indice] = scanner.nextDouble();  // Asigna el precio del producto
                    } else {
                        System.out.println("Índice inválido. Debe ser un número entre 0 y 9.");
                    }
                    break;
                
                case 2:  // Opción 2: Buscar un producto
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String nombreBusqueda = scanner.next();  // Lee el nombre del producto que se busca

                    boolean encontrado = false;  // Bandera para verificar si se encuentra el producto

                    // Bucle para recorrer los productos y verificar si el nombre coincide
                    for (int i = 0; i < 10; i++) {
                        if (nombres[i] != null && nombres[i].equals(nombreBusqueda)) {  // Verifica si el nombre del producto coincide
                            System.out.println("Producto encontrado: " + nombres[i]);
                            System.out.println("Cantidad: " + cantidades[i]);
                            System.out.println("Precio: " + precios[i]);
                            encontrado = true;  // Marca que el producto fue encontrado
                            break;
                        }
                    }
                    if (!encontrado) {  // Si no se encuentra el producto
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                
                case 3:  // Opción 3: Calcular valor total del inventario
                    double totalInventario = 0;  // Variable para almacenar el valor total del inventario

                    // Bucle para recorrer todos los productos y sumar el valor total
                    for (int i = 0; i < 10; i++) {
                        if (nombres[i] != null) {  // Solo calcula productos que tienen un nombre asignado
                            totalInventario += cantidades[i] * precios[i];  // Calcula el valor total del producto (cantidad * precio)
                        }
                    }

                    System.out.println("El valor total del inventario es: $" + totalInventario);  // Muestra el valor total
                    break;

                case 4:  // Opción 4: Salir del programa
                    continuar = false;  // Cambia la bandera a false para salir del ciclo
                    System.out.println("Saliendo del programa...");
                    break;

                default:  // Si el usuario ingresa una opción no válida
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
                    break;
            }
        }

        scanner.close();  // Cierra el scanner al final del programa
    }
}






   




