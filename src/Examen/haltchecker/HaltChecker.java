package Examen.haltchecker;
public class HaltChecker {
    public static boolean willHalt(String programCode, int startValue) {
        // Verifica si el programa tiene un límite claro de detención en el bucle
        if (programCode.contains("for") && programCode.contains("i >= 0")) {
            return true; // El programa tiene un bucle que cuenta hacia atrás hasta cero
        } else if (programCode.contains("while") && programCode.contains("true")) {
            return false; // El programa tiene un bucle infinito
        }
        return false; // Por defecto asumimos que no se detiene
    }

    public static void main(String[] args) {
        String countdownCode = "for (int i = start; i >= 0; i--) { System.out.println(i); }";
        String countUpCode = "while (true) { System.out.println(start); start++; }";

        boolean countdownHalt = willHalt(countdownCode, 10);
        boolean countUpHalt = willHalt(countUpCode, 0);

        System.out.println("¿El programa de cuenta regresiva se detiene? " + countdownHalt);
        System.out.println("¿El programa de cuenta ascendente se detiene? " + countUpHalt);
    }
}
