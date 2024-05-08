package Examen.handlers;


import Examen.handlers.Handler;

public class TerminateHandler implements Handler {
    @Override
    public void setNextHandler(Handler nextHandler) {
        // No necesita próximo manejador
    }

    @Override
    public void handleRequest(boolean willHalt) {
        System.out.println("Terminando inmediatamente porque el programa no se detiene.");
        System.exit(0); // Termina el programa
    }
}