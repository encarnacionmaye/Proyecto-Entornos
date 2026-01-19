package proyectoentornos;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ian.gutierrez
 */
public class AdivinarNumero {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // 1 a 100
        int intento;
        int intentos = 0;

        System.out.println("Adivina el número");
        System.out.println("Estoy pensando en un número entre 1 y 100...");

        do {
            System.out.print("Ingresa tu número: ");
            intento = teclado.nextInt();
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("Muy bajo");
            } else if (intento > numeroSecreto) {
                System.out.println("Muy alto");
            } else {
                System.out.println("Correcto!");
                System.out.println("Lo lograste en " + intentos + " intentos.");
            }

        } while (intento != numeroSecreto);

        teclado.close();
    }
}