package Examen.handlers;

import Examen.handlers.Handler;

public class HaltHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(boolean willHalt) {
        if (willHalt) {
            while (true) { // Entra en un bucle infinito
                System.out.println("Entrando en bucle infinito porque el programa se detiene.");
            }
        } else if (nextHandler != null) {
            nextHandler.handleRequest(willHalt);
        }
    }
}
