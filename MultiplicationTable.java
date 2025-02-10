import java.util.Scanner;

public class MultiplicationTabled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int i = 1;

        do {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
    }
}
