import java.awt.*;  
import java.awt.event.*;  

public class EnhancedAWTExample {  
    public static void main(String[] args) {  
        // Creating a Frame
        Frame frame = new Frame("Enhanced AWT Example");

        // Creating a Label
        Label label = new Label("Enter your name:");
        label.setBounds(50, 50, 120, 30);

        // Creating a TextField
        TextField textField = new TextField();
        textField.setBounds(180, 50, 150, 30);

        // Creating a Dropdown (Choice)
        Choice prefixChoice = new Choice();
        prefixChoice.add("Mr.");
        prefixChoice.add("Ms.");
        prefixChoice.add("Dr.");
        prefixChoice.add("Prof.");
        prefixChoice.setBounds(50, 100, 80, 30);

        // Creating a Text Area
        TextArea textArea = new TextArea("Your custom message will appear here...");
        textArea.setBounds(50, 150, 280, 100);
        textArea.setEditable(false);

        // Creating a Submit Button
        Button submitButton = new Button("Submit");
        submitButton.setBounds(50, 270, 80, 30);

        // Creating a Reset Button
        Button resetButton = new Button("Reset");
        resetButton.setBounds(150, 270, 80, 30);

        // Adding an event listener for the Submit button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                String prefix = prefixChoice.getSelectedItem();
                textArea.setText("Hello, " + prefix + " " + name + "!\nWelcome to the Enhanced AWT Example.");
            }
        });

        // Adding an event listener for the Reset button
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                textArea.setText("Your custom message will appear here...");
                label.setText("Enter your name:");
            }
        });

        // Adding components to the Frame
        frame.add(label);
        frame.add(textField);
        frame.add(prefixChoice);
        frame.add(textArea);
        frame.add(submitButton);
        frame.add(resetButton);

        // Setting Frame size and layout
        frame.setSize(400, 350);
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
