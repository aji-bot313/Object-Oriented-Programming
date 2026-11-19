import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator {

    public static void main(String[] args) {

        // FRAME = the main window
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());           
        //  ATOMIC COMPONENTS = single, basic components
        JLabel title = new JLabel("Calculator", SwingConstants.CENTER);
        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField();
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField();
        JButton addButton = new JButton("Add (+)");
        JButton subButton = new JButton("Subtract (-)");
        JLabel result = new JLabel("Result: ", SwingConstants.CENTER);
        //INTERMEDIATE COMPONENTS = panels that hold other components
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2, 4, 4)); 
        inputPanel.add(label1);
        inputPanel.add(field1);
        inputPanel.add(label2);
        inputPanel.add(field2);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());     
        buttonPanel.add(addButton);
        buttonPanel.add(subButton);
        buttonPanel.add(result);
        //  EVENT LISTENERS = run code when a button is clicked
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(field1.getText());
                double b = Double.parseDouble(field2.getText());
                result.setText("Result: " + (a + b));
            }
        });
        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(field1.getText());
                double b = Double.parseDouble(field2.getText());
                result.setText("Result: " + (a - b));
            }
        });
        // Add everything to the frame, then show it
        frame.add(title, BorderLayout.NORTH);
        frame.add(inputPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}