import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {
        // Task 1: Create an integer array to store the grades of 30 students
        int[] grades = new int[30];

        // Task 2: Populate the array with random grades between 0 and 100
        for (int i = 0; i < 30; i++) {
            grades[i] = (int) (Math.random() * 101);
        }

        // Task 3: Calculate and print the average grade of the class
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = (double) sum / 30;
        System.out.println("Average grade: " + average);

        // Task 4: Find and print the highest and lowest grades
        int highest = grades[0];
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        // Task 5: Sort the grades in descending order and print the top 5 scores
        Arrays.sort(grades);
        System.out.println("Top 5 scores:");
        for (int i = 29; i >= 25; i--) {
            System.out.println(grades[i]);
        }
    }
}


