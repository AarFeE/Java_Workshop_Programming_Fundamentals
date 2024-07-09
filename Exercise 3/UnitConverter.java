import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        scanner.close();

        double miles = kilometers / 1.60934;
        System.out.println("Equivalent distance in miles: " + miles);
    }
}
