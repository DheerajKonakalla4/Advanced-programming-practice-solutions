import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            int i = 1;
            
            do {
                factorial *= i;
                i++;
            } while (i <= number);
            
            System.out.println("The factorial of " + number + " is " + factorial);
        }
        
        scanner.close();
    }
}
