package Examen.app;

import Examen.haltchecker.HaltChecker;
import Examen.handlers.HaltHandler;
import Examen.handlers.Handler;
import Examen.handlers.TerminateHandler;

public class Reverser {
    public static void main(String[] args) {
        String programCode = "while (true) { System.out.println('Looping...'); }"; // Código de ejemplo que simula el bucle infinito

        boolean haltResult = HaltChecker.willHalt(programCode, 0); // Usamos el HaltChecker simulado

        // Configurando la cadena de responsabilidad
        Handler haltHandler = new HaltHandler();
        Handler terminateHandler = new TerminateHandler();

        haltHandler.setNextHandler(terminateHandler); // Configura el siguiente manejador

        haltHandler.handleRequest(haltResult); // Inicia el manejo de la solicitud
    }
}

