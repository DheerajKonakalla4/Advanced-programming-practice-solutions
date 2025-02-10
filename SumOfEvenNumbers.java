import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int i = 1;
        int sum = 0;

        do {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        } while (i <= num);

        System.out.println("The sum of even numbers from 1 to " + num + " is: " + sum);
    }
}