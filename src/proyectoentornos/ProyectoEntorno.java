package proyectoentornos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ProyectoEntorno {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("SIMULADOR DE DADOS ?");
        System.out.print("¿Cuantos dados quieres lanzar? (1 o 2): ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            int dado = random.nextInt(6) + 1;
            System.out.println("Resultado del dado: " + dado);

        } else if (opcion == 2) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int suma = dado1 + dado2;

            System.out.println("Dado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);
            System.out.println("Suma total: " + suma);

        } else {
            System.out.println("Opción no válida. Solo puedes elegir 1 o 2 dados.");
        }

        scanner.close();
    }
}