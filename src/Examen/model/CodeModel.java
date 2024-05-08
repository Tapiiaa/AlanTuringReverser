package Examen.model;

import Examen.analyzers.CodeAnalyzer;
import Examen.analyzers.LoopAnalyzer;

public class CodeModel {
    private CodeAnalyzer analyzer;

    public CodeModel() {
        // Inicializa con un analizador específico
        this.analyzer = new LoopAnalyzer();
    }

    public boolean analyzeCode(String code) throws Exception {
        try {
            analyzer.analyze(code);
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean willHalt(boolean isCountUp) {
        if (isCountUp) {
            return false; // Indica que un programa que cuenta hacia arriba nunca se detiene.
        } else {
            return true; // Indica que un programa que cuenta hacia abajo se detiene al llegar a cero.
        }
    }
}
