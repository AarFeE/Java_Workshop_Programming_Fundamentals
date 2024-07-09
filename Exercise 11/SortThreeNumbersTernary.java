import java.util.Scanner;

public class SortThreeNumbersTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        scanner.close();

        int smallest = (num1 <= num2 && num1 <= num3) ? num1 : (num2 <= num1 && num2 <= num3) ? num2 : num3;
        int largest = (num1 >= num2 && num1 >= num3) ? num1 : (num2 >= num1 && num2 >= num3) ? num2 : num3;
        int middle = (num1 != smallest && num1 != largest) ? num1 : (num2 != smallest && num2 != largest) ? num2 : num3;

        System.out.println("Sorted order: " + smallest + ", " + middle + ", " + largest);
    }
}
