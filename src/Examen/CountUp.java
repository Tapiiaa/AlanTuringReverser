package Examen;

public class CountUp {
    public static void main(String[] args) {
        int start = 0; // Inicia desde 0
        while (true) {
            System.out.println("Contando hacia arriba: " + start);
            start++; // Incrementa el contador
            try {
                Thread.sleep(1000); // Pausa de 1 segundo entre cada número
            } catch (InterruptedException e) {
                System.out.println("El hilo fue interrumpido");
            }
        }
    }
}

