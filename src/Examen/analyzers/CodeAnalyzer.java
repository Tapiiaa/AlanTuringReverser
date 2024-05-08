package Examen.analyzers;


public interface CodeAnalyzer {
    void analyze(String codeSegment) throws SyntaxException;
}
