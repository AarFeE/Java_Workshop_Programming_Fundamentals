import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        scanner.close();

        double convertedTemperature;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                convertedTemperature = celsius * 9 / 5 + 32;
                System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                convertedTemperature = (fahrenheit - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + convertedTemperature);
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}
