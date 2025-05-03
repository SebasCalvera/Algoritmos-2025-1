package M3;

public class Pares {
    public static void main(String[] args) {
        
        Instrucciones();
        imprimirPares();

    }
        public static void Instrucciones() {
            System.out.println("Este programa imprime todos los números pares entre 1 y 20");
        }

        public static void imprimirPares() {
            System.out.println("Los números pares entre 1 y 20 son:");
            for (int i = 1; i <= 20; i++) {
               
                int division = i / 2;
             
                int resultado = division * 2;
           
                if (resultado == i) {
                    System.out.println(i);
                }
            }
        }
    
    }

