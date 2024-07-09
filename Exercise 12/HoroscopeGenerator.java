import java.util.Scanner;

public class HoroscopeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter your birth day: ");
        int day = scanner.nextInt();

        scanner.close();

        String sign = "";

        switch (month) {
            case 1:
                sign = (day <= 19) ? "Capricorn" : "Aquarius";
                break;
            case 2:
                sign = (day <= 18) ? "Aquarius" : "Pisces";
                break;
            case 3:
                sign = (day <= 20) ? "Pisces" : "Aries";
                break;
            case 4:
                sign = (day <= 19) ? "Aries" : "Taurus";
                break;
            case 5:
                sign = (day <= 20) ? "Taurus" : "Gemini";
                break;
            case 6:
                sign = (day <= 20) ? "Gemini" : "Cancer";
                break;
            case 7:
                sign = (day <= 22) ? "Cancer" : "Leo";
                break;
            case 8:
                sign = (day <= 22) ? "Leo" : "Virgo";
                break;
            case 9:
                sign = (day <= 22) ? "Virgo" : "Libra";
                break;
            case 10:
                sign = (day <= 22) ? "Libra" : "Scorpio";
                break;
            case 11:
                sign = (day <= 21) ? "Scorpio" : "Sagittarius";
                break;
            case 12:
                sign = (day <= 21) ? "Sagittarius" : "Capricorn";
                break;
            default:
                System.out.println("Invalid month.");
                return;
        }

        System.out.println("Your zodiac sign is: " + sign);
    }
}
