package Examen.analyzers;

public class LoopAnalyzer implements CodeAnalyzer {
    @Override
    public void analyze(String codeSegment) throws SyntaxException {
        if (codeSegment.contains("for")) {
            analyzeForLoop(codeSegment);
        } else if (codeSegment.contains("while")) {
            analyzeWhileLoop(codeSegment);
        } else {
            throw new SyntaxException("Error de sintaxis: Bucle no definido correctamente.");
        }
    }

    private void analyzeForLoop(String codeSegment) throws SyntaxException {
        // Verificación básica de la estructura de un bucle for
        if (!codeSegment.matches(".*for\\s*\\(([^;]*;){2}[^;]*\\).*")) {
            throw new SyntaxException("Error de sintaxis: Bucle 'for' no está estructurado correctamente.");
        }

    }

    private void analyzeWhileLoop(String codeSegment) throws SyntaxException {
        // Verificación básica de la estructura de un bucle while
        if (!codeSegment.matches(".*while\\s*\\([^\\)]*\\).*")) {
            throw new SyntaxException("Error de sintaxis: Bucle 'while' no está estructurado correctamente.");
        }

    }
}