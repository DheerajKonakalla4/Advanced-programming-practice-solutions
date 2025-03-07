import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarInsuranceSystem {
    private JFrame frame;
    private JTextField txtName, txtAge, txtCarNumber, txtCarModel, txtCarValue, txtQuote, txtLicense, txtCarAge;
    private JButton btnCalculate, btnSave;
    private JTextArea textArea;

    public CarInsuranceSystem() {
        frame = new JFrame("Car Insurance System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 600);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Name:"), gbc);
        txtName = new JTextField(15);
        gbc.gridx = 1;
        panel.add(txtName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Age:"), gbc);
        txtAge = new JTextField(5);
        gbc.gridx = 1;
        panel.add(txtAge, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Car Number:"), gbc);
        txtCarNumber = new JTextField(10);
        gbc.gridx = 1;
        panel.add(txtCarNumber, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Car Model:"), gbc);
        txtCarModel = new JTextField(15);
        gbc.gridx = 1;
        panel.add(txtCarModel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(new JLabel("Car Value (₹):"), gbc);
        txtCarValue = new JTextField(10);
        gbc.gridx = 1;
        panel.add(txtCarValue, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(new JLabel("Car Age (years):"), gbc);
        txtCarAge = new JTextField(5);
        gbc.gridx = 1;
        panel.add(txtCarAge, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(new JLabel("Driving License No:"), gbc);
        txtLicense = new JTextField(15);
        gbc.gridx = 1;
        panel.add(txtLicense, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(new JLabel("Insurance Quote (₹):"), gbc);
        txtQuote = new JTextField(10);
        txtQuote.setEditable(false);
        gbc.gridx = 1;
        panel.add(txtQuote, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        btnCalculate = new JButton("Calculate Quote");
        panel.add(btnCalculate, gbc);
        gbc.gridx = 1;
        btnSave = new JButton("Save Info");
        panel.add(btnSave, gbc);

        textArea = new JTextArea(10, 50);
        textArea.setEditable(false);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Button Actions
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateQuote();
            }
        });

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveInfo();
            }
        });

        frame.setVisible(true);
    }

    private void calculateQuote() {
        try {
            String name = txtName.getText();
            int age = Integer.parseInt(txtAge.getText());
            String carNumber = txtCarNumber.getText();
            String carModel = txtCarModel.getText();
            double carValue = Double.parseDouble(txtCarValue.getText());
            int carAge = Integer.parseInt(txtCarAge.getText());

            if (age < 18) {
                JOptionPane.showMessageDialog(frame, "Minors cannot get insurance.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double baseRate = 0.05;
            double ageFactor = age < 25 ? 1.5 : 1.0;
            double carAgeFactor = carAge > 5 ? 1.2 : 1.0;
            double quote = carValue * baseRate * ageFactor * carAgeFactor;

            txtQuote.setText(String.format("₹%.2f", quote));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void saveInfo() {
        String name = txtName.getText();
        String age = txtAge.getText();
        String carNumber = txtCarNumber.getText();
        String carModel = txtCarModel.getText();
        String carValue = txtCarValue.getText();
        String carAge = txtCarAge.getText();
        String license = txtLicense.getText();
        String quote = txtQuote.getText();

        if (!name.isEmpty() && !age.isEmpty() && !carNumber.isEmpty() && !carModel.isEmpty() && !carValue.isEmpty() && !carAge.isEmpty() && !license.isEmpty() && !quote.isEmpty()) {
            String info = String.format("Name: %s\nAge: %s\nCar Number: %s\nCar Model: %s\nCar Value: %s\nCar Age: %s\nLicense: %s\nQuote: %s\n\n",
                    name, age, carNumber, carModel, carValue, carAge, license, quote);
            textArea.append(info);
        } else {
            JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Missing Information", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CarInsuranceSystem::new);
    }
}