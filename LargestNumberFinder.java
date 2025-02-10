import java.util.Random;

public class LargestNumberFinder {
    public static void main(String[] args) {
        LargestNumberFinder finder = new LargestNumberFinder();
        int[] numbers = finder.fillArray(10, 1, 100);
        int largest = finder.findLargest(numbers);
        System.out.println("The array is: " + java.util.Arrays.toString(numbers));
        System.out.println("The largest number in the array is: " + largest);
    }

    public int[] fillArray(int size, int min, int max) {
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(max - min + 1) + min;
        }
        return numbers;
    }

    public int findLargest(int[] numbers) {
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }
}
