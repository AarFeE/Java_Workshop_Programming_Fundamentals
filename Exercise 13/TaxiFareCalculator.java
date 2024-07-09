import java.util.Scanner;

public class TaxiFareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance of the trip (in kilometers): ");
        double distance = scanner.nextDouble();

        scanner.close();

        double baseFare = 3.00; // Base fare in dollars
        double farePerKilometer = 2.00; // Additional fare per kilometer in dollars

        double totalFare = baseFare + (distance * farePerKilometer);

        System.out.println("The total fare is: $" + totalFare);
    }
}
