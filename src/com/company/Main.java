package com.company;

import java.awt.EventQueue;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.Locale;
import javax.swing.*;

import com.company.util.SwingUtils;

public class Main {

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.ROOT);

        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        SwingUtils.setDefaultFont("Arial", 18);

        EventQueue.invokeLater(() -> {
            try {
                SwingUtils.setDefaultFont("Arial", 18);
                JFrame window = new Window();
                window.setSize(1100, 600);
                window.setVisible(true);
            } catch (Exception ex) {
                SwingUtils.showErrorMessageBox(ex);
            }
              });
    }
}
