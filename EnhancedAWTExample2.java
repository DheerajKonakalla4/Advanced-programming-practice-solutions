import java.awt.*;  
import java.awt.event.*;  

public class EnhancedAWTExample2 {  
    public static void main(String[] args) {  
        // Creating a Frame
        Frame frame = new Frame("Basic AWT for addition");

        // Creating Labels
        Label nameLabel = new Label("Enter your name:");
        nameLabel.setBounds(50, 50, 120, 30);

        Label regNumberLabel = new Label("Enter your register number:");
        regNumberLabel.setBounds(50, 100, 150, 30);

        Label num1Label = new Label("Enter first number:");
        num1Label.setBounds(50, 150, 150, 30);

        Label num2Label = new Label("Enter second number:");
        num2Label.setBounds(50, 200, 150, 30);

        // Creating TextFields for inputs
        TextField nameField = new TextField();
        nameField.setBounds(200, 50, 150, 30);

        TextField regNumberField = new TextField();
        regNumberField.setBounds(200, 100, 150, 30);

        TextField num1Field = new TextField();
        num1Field.setBounds(200, 150, 150, 30);

        TextField num2Field = new TextField();
        num2Field.setBounds(200, 200, 150, 30);

        // Creating a Submit Button
        Button submitButton = new Button("Print");
        submitButton.setBounds(50, 250, 80, 30);

        // Creating a Reset Button
        Button resetButton = new Button("Reset");
        resetButton.setBounds(150, 250, 80, 30);

        // Creating a Canvas for displaying the results
        Canvas displayCanvas = new Canvas() {
            public void paint(Graphics g) {
                // Drawing the rectangle
                g.drawRect(50, 300, 300, 120);
            }
        };
        displayCanvas.setBounds(50, 300, 300, 120);

        // Adding an event listener for the Submit button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String regNumber = regNumberField.getText();
                String num1Text = num1Field.getText();
                String num2Text = num2Field.getText();

                // Handling number input
                int num1 = Integer.parseInt(num1Text);
                int num2 = Integer.parseInt(num2Text);
                int sum = num1 + num2;

                Graphics g = displayCanvas.getGraphics();
                
                // Clearing the previous text
                g.clearRect(1, 1, displayCanvas.getWidth()-2, displayCanvas.getHeight()-2);
                
                // Redrawing the rectangle
                g.drawRect(0, 0, 299, 119);
                
                // Displaying the name, register number, and sum inside the rectangle
                g.drawString("Hello, " + name + "!", 20, 40);
                g.drawString("Register Number: " + regNumber, 20, 70);
                g.drawString("Sum of " + num1 + " and " + num2 + " is: " + sum, 20, 100);
            }
        });

        // Adding an event listener for the Reset button
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                regNumberField.setText("");
                num1Field.setText("");
                num2Field.setText("");
                
                // Clear the rectangle content
                Graphics g = displayCanvas.getGraphics();
                g.clearRect(1, 1, displayCanvas.getWidth()-2, displayCanvas.getHeight()-2);
                
                // Redrawing the rectangle
                g.drawRect(0, 0, 299, 119);
            }
        });

        // Adding components to the Frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(regNumberLabel);
        frame.add(regNumberField);
        frame.add(num1Label);
        frame.add(num1Field);
        frame.add(num2Label);
        frame.add(num2Field);
        frame.add(submitButton);
        frame.add(resetButton);
        frame.add(displayCanvas);

        // Setting Frame size and layout
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);

        // Adding a window listener to handle window closing
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }  
}

