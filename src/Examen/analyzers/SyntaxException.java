package Examen.analyzers;


/**
 * Excepción personalizada para representar errores de sintaxis en el análisis de código.
 */
public class SyntaxException extends Exception {
    /**
     * Constructor que permite especificar un mensaje de error.
     * @param message Mensaje que describe el error de sintaxis.
     */
    public SyntaxException(String message) {
        super(message);
    }

    /**
     * Constructor que permite especificar un mensaje de error y una causa.
     * @param message Mensaje que describe el error de sintaxis.
     * @param cause La excepción subyacente que es la causa de esta excepción.
     */
    public SyntaxException(String message, Throwable cause) {
        super(message, cause);
    }
}
