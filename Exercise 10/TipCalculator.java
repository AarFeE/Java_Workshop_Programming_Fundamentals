import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total bill: ");
        double totalBill = scanner.nextDouble();

        System.out.print("Enter the tip percentage: ");
        double tipPercentage = scanner.nextDouble();

        scanner.close();

        double tipAmount = totalBill * (tipPercentage / 100);

        System.out.println("Tip amount: " + tipAmount);
    }
}
