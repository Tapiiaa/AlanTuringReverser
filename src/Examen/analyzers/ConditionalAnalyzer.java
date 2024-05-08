package Examen.analyzers;



public class ConditionalAnalyzer implements CodeAnalyzer {
    @Override
    public void analyze(String codeSegment) throws SyntaxException {
        if (codeSegment.contains("if")) {
            analyzeIfStatement(codeSegment);
        } else if (codeSegment.contains("switch")) {
            analyzeSwitchStatement(codeSegment);
        } else {
            throw new SyntaxException("Error de sintaxis: Estructura condicional no definida correctamente.");
        }
    }

    private void analyzeIfStatement(String codeSegment) throws SyntaxException {
        // Verificación básica de la estructura de una declaración if
        if (!codeSegment.matches(".*if\\s*\\([^\\)]*\\).*")) {
            throw new SyntaxException("Error de sintaxis: Declaración 'if' no está estructurada correctamente.");
        }
        // Podrías añadir más lógica para validar que la condición y los bloques de código son correctos
    }

    private void analyzeSwitchStatement(String codeSegment) throws SyntaxException {
        // Verificación básica de la estructura de una declaración switch
        if (!codeSegment.matches(".*switch\\s*\\([^\\)]*\\)\\s*\\{[^\\}]*\\}.*")) {
            throw new SyntaxException("Error de sintaxis: Declaración 'switch' no está estructurada correctamente.");
        }
        // Se podrían añadir comprobaciones para asegurarse de que los casos y los bloques de código son válidos
    }
}
