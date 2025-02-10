import java.awt.*;  
import java.awt.event.*;  

public class SimpleAWTExample1 {  
    public static void main(String[] args) {  
        // Creating a Frame
        Frame frame = new Frame("Simple AWT Example");

        // Creating Labels
        Label nameLabel = new Label("Enter your name:");
        nameLabel.setBounds(50, 50, 120, 30);

        Label regNumberLabel = new Label("Enter your register number:");
        regNumberLabel.setBounds(50, 100, 150, 30);

        // Creating a TextField for name
        TextField nameField = new TextField();
        nameField.setBounds(200, 50, 150, 30);

        // Creating a TextField for register number
        TextField regNumberField = new TextField();
        regNumberField.setBounds(200, 100, 150, 30);

        // Creating a Submit Button
        Button submitButton = new Button("Submit");
        submitButton.setBounds(50, 150, 80, 30);

        // Creating a Reset Button
        Button resetButton = new Button("Reset");
        resetButton.setBounds(150, 150, 80,

