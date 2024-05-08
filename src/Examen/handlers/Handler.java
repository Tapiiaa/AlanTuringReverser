package Examen.handlers;

//Interfaz de manejadores

public interface Handler {
        void setNextHandler(Handler nextHandler);

        void handleRequest(boolean willHalt);
    }

