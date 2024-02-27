import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.circle;

public class App extends JFrame {
    private Timer timer;
    private circle circle;

    public App() {
        setTitle("Point by Point Circle Drawing");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        circle = new circle(250, 250, 100);

        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                circle.update();
                repaint();
            }
        });

        JButton startButton = new JButton("Draw circle");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);

        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        circle.draw(g2d);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }
}
