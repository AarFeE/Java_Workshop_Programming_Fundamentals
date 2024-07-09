import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first grade: ");
        double grade1 = scanner.nextDouble();
        System.out.print("Enter the second grade: ");
        double grade2 = scanner.nextDouble();
        System.out.print("Enter the third grade: ");
        double grade3 = scanner.nextDouble();

        scanner.close();

        double average = (grade1 + grade2 + grade3) / 3;

        System.out.println("Average: " + average);

        if (average >= 6) {
            System.out.println("The student passes.");
        } else {
            System.out.println("The student does not pass.");
        }
    }
}
