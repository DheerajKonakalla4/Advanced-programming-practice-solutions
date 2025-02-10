import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int sum = 0;
        int i = 1;

        while (i <= num) {
            sum += i;
            i++;
        }

        System.out.println("The sum of natural numbers from 1 to " + num + " is: " + sum);
    }
}