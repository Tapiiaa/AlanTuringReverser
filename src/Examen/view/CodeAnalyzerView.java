package Examen.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CodeAnalyzerView extends JFrame {
    private JTextArea codeArea;
    private JButton countUpButton;
    private JButton countDownButton;
    private JLabel statusLabel;
    private JProgressBar progressBar;

    public CodeAnalyzerView() {
        setTitle("Code Analyzer");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        initializeComponents();
    }

    private void initializeComponents() {
        codeArea = new JTextArea("Insert your code here...");
        add(new JScrollPane(codeArea), BorderLayout.CENTER);

        countUpButton = new JButton("Count Up");
        countDownButton = new JButton("Count Down");
        statusLabel = new JLabel("Ready");

        add(countUpButton);
        add(countDownButton);
        add(statusLabel);

        progressBar = new JProgressBar();
        progressBar.setIndeterminate(true);
        progressBar.setVisible(false);  // Initially, the progress bar should be hidden.
        add(progressBar, BorderLayout.SOUTH);
    }

    public void addCountUpButtonListener(ActionListener listener) {
        countUpButton.addActionListener(listener);
    }

    public void addCountDownButtonListener(ActionListener listener) {
        countDownButton.addActionListener(listener);
    }

    public void setStatusText(String text) {
        statusLabel.setText(text);
    }

    public void setProgressBarVisible(boolean isVisible) {
        progressBar.setVisible(isVisible);
    }
}