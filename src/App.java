import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import models.circle;

public class App extends JFrame {
    private Timer timer;
    private circle circle;

    public App() {
        setTitle("Point by Point Circle Drawing");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton startButton = new JButton("Draw circle");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ask the user for center and radius
                ArrayList<Integer> info = askForInfo();
                int center = info.get(0);
                int radius = info.get(1);

                circle = new circle(center, center, radius);

                // Start the timer after getting user input
                timer.start();
            }
        });

        timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (circle != null) {
                    circle.update();
                    repaint();
                }
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);

        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        if (circle != null) {
            circle.draw(g2d);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    ArrayList<Integer> askForInfo() {
        ArrayList<Integer> result = new ArrayList<>();
        
        while (true) {
            int center = Integer.parseInt(JOptionPane.showInputDialog("Enter positive X coordinate for center:"));
            int radius = Integer.parseInt(JOptionPane.showInputDialog("Enter positive radius:"));
    
            if (center > 0 && radius > 0) {
                result.add(center);
                result.add(radius);
                break; // Exit the loop if positive values are entered
            } else {
                // Show an error message for non-positive values
                JOptionPane.showMessageDialog(null, "Please enter positive values for center and radius.");
            }
        }
    
        return result;
    }
}
