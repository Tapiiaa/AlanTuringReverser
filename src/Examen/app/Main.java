package Examen.app;


 // Asegúrate de que esta clase también esté en su propio paquete si es necesario

import Examen.controller.CodeController; // Importa el controlador
import Examen.model.CodeModel;            // Importa el modelo
import Examen.view.CodeAnalyzerView;     // Importa la vista

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            CodeModel model = new CodeModel();
            CodeAnalyzerView view = new CodeAnalyzerView();
            new CodeController(model, view);
        });
    }
}

