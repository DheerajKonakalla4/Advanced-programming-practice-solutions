import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to end the series: ");
        int endNum = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        int count = 0;
        double sum = 0;

        while (true) {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            if (num == endNum) {
                break;
            }

            count++;
            sum += num;
        }

        double average = sum / count;

        System.out.println("The average of the series is: " + average);
    }
}