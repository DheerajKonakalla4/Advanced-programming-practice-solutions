import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        double principal = scanner.nextDouble();
        System.out.println("Enter the annual interest rate (in percentage): ");
        double rate = scanner.nextDouble();
        System.out.println("Enter the number of years: ");
        int years = scanner.nextInt();
        scanner.close();

        System.out.println("Simple interest for the given inputs:");
        for (int i = 1; i <= years; i++) {
            double interest = principal * rate * i / 100;
            System.out.println("Year " + i + ": " + interest);
        }
    }
}