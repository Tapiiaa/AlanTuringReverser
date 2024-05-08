package Examen;

import static java.lang.Thread.sleep;

public class Countdown {
    public static void main(String[] args) {
        int start = 10; // Inicia desde 10, puedes cambiar este valor para empezar desde otro número
        for (int i = start; i >= 0; i--) {
            System.out.println("Contando hacia abajo: " + i);
            try {
                sleep(1000); // Pausa de 1 segundo entre cada número
            } catch (InterruptedException e) {
                System.out.println("El hilo fue interrumpido");
            }
        }
        System.out.println("¡Llegamos a cero!");
    }
}
