import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CarInsurancePolicy {
    private String policyNumber;
    private String ownerName;
    private String carModel;
    private int carYear;
    private double basePremium;
    private double calculatedPremium;

    public CarInsurancePolicy(String policyNumber, String ownerName, String carModel, int carYear, double basePremium) {
        this.policyNumber = policyNumber;
        this.ownerName = ownerName;
        this.carModel = carModel;
        this.carYear = carYear;
        this.basePremium = basePremium;
        this.calculatedPremium = calculatePremium();
    }

    private double calculatePremium() {
        int currentYear = 2024;
        int carAge = currentYear - carYear;

        if (carAge < 5) {
            return basePremium * 1.2; // 20% increase for newer cars
        } else if (carAge <= 10) {
            return basePremium * 1.0; // No change for medium-aged cars
        } else {
            return basePremium * 0.8; // 20% discount for older cars
        }
    }

    public String getPolicyDetails() {
        return "Policy Number: " + policyNumber + "\n" +
                "Owner Name: " + ownerName + "\n" +
                "Car Model: " + carModel + "\n" +
                "Car Year: " + carYear + "\n" +
                "Base Premium: $" + basePremium + "\n" +
                "Calculated Premium: $" + calculatedPremium;
    }
}

public class CarInsuranceSystemGUI extends JFrame implements ActionListener {

    private JTextField policyNumberField, ownerNameField, carModelField, carYearField, basePremiumField;
    private JTextArea resultArea;

    public CarInsuranceSystemGUI() {
        setTitle("Car Insurance System");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel policyNumberLabel = new JLabel("Policy Number:");
        policyNumberLabel.setBounds(20, 20, 100, 25);
        add(policyNumberLabel);

        policyNumberField = new JTextField();
        policyNumberField.setBounds(140, 20, 200, 25);
        add(policyNumberField);

        JLabel ownerNameLabel = new JLabel("Owner Name:");
        ownerNameLabel.setBounds(20, 60, 100, 25);
        add(ownerNameLabel);

        ownerNameField = new JTextField();
        ownerNameField.setBounds(140, 60, 200, 25);
        add(ownerNameField);

        JLabel carModelLabel = new JLabel("Car Model:");
        carModelLabel.setBounds(20, 100, 100, 25);
        add(carModelLabel);

        carModelField = new JTextField();
        carModelField.setBounds(140, 100, 200, 25);
        add(carModelField);

        JLabel carYearLabel = new JLabel("Car Year:");
        carYearLabel.setBounds(20, 140, 100, 25);
        add(carYearLabel);

        carYearField = new JTextField();
        carYearField.setBounds(140, 140, 200, 25);
        add(carYearField);

        JLabel basePremiumLabel = new JLabel("Base Premium:");
        basePremiumLabel.setBounds(20, 180, 100, 25);
        add(basePremiumLabel);

        basePremiumField = new JTextField();
        basePremiumField.setBounds(140, 180, 200, 25);
        add(basePremiumField);

        JButton calculateButton = new JButton("Calculate Premium");
        calculateButton.setBounds(100, 220, 180, 25);
        calculateButton.addActionListener(this);
        add(calculateButton);

        resultArea = new JTextArea();
        resultArea.setBounds(20, 260, 340, 120);
        resultArea.setEditable(false);
        add(resultArea);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String policyNumber = policyNumberField.getText();
            String ownerName = ownerNameField.getText();
            String carModel = carModelField.getText();
            int carYear = Integer.parseInt(carYearField.getText());
            double basePremium = Double.parseDouble(basePremiumField.getText());

            CarInsurancePolicy policy = new CarInsurancePolicy(policyNumber, ownerName, carModel, carYear, basePremium);

            resultArea.setText(policy.getPolicyDetails());
        } catch (NumberFormatException ex) {
            resultArea.setText("Please enter valid numbers for Car Year and Base Premium.");
        }
    }

    public static void main(String[] args) {
        CarInsuranceSystemGUI gui = new CarInsuranceSystemGUI();
        gui.setVisible(true);
    }
}
