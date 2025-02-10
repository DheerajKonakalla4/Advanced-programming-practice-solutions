import java.util.InputMismatchException;
import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            try {
                System.out.println("Enter a positive number: ");
                num = scanner.nextInt();

                if (num <= 0) {
                    System.out.println("Please enter a positive number.");
                    continue;
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close();

        System.out.println("You entered: " + num);
    }
}
