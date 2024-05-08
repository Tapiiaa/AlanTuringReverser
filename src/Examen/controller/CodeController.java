package Examen.controller;

import Examen.model.CodeModel;
import Examen.view.CodeAnalyzerView;
import javax.swing.*;

public class CodeController {
    private CodeModel model;
    private CodeAnalyzerView view;

    public CodeController(CodeModel model, CodeAnalyzerView view) {
        this.model = model;
        this.view = view;
        initView();
    }

    private void initView() {
        view.setVisible(true);
        view.addCountUpButtonListener(e -> handleCount(true));
        view.addCountDownButtonListener(e -> handleCount(false));
    }

    private void handleCount(boolean isCountUp) {
        view.setProgressBarVisible(true);
        SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                int steps = 10; // Define the number of steps in the analysis simulation
                for (int i = 0; i < steps; i++) {
                    Thread.sleep(500); // Sleep to simulate time-consuming analysis
                    publish("Analyzing... Step " + (i + 1) + " of " + steps);
                }
                return null;
            }

            @Override
            protected void process(java.util.List<String> chunks) {
                // Update the status label with the latest step
                view.setStatusText(chunks.get(chunks.size() - 1));
            }

            @Override
            protected void done() {
                boolean willHalt = model.willHalt(isCountUp);
                view.setStatusText(willHalt ? "Analysis Complete: Will halt." : "Analysis Complete: Will not halt.");
                view.setProgressBarVisible(false);
            }
        };
        worker.execute();
    }
}


