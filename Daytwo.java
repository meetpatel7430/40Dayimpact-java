import java.util.*;
public class Daytwo {
    public static void main(String[] args) {
        // reverse number
        // int number = 357;
        // int reversedNumber = 0;

        // int digit1 = number / 100;
        // int digit2 = (number % 100) / 10;
        // int digit3 = number % 10;

        // reversedNumber = digit3 * 100 + digit2 * 10 + digit1;

        // System.out.println("Original Number: " + number);
        // System.out.println("Reversed Number: " + reversedNumber);

        // odd even notvalid
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter an integer: ");
        // int number = scanner.nextInt();

        // if (number == 0) {
        //     System.out.println("Zero");
        // } else if (number % 2 == 0) {
        //     System.out.println("Even number");
        // } else if (number % 2 != 0) {
        //     System.out.println("Odd number");
        // } else {
        //     System.out.println("Invalid number");
        // }
        // scanner.close();



        //weird or notweird
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // scanner.close();

        // if (n % 2 != 0) {
        //     System.out.println("Weird");
        // } else {
        //     if (n >= 2 && n <= 5) {
        //         System.out.println("Not Weird");
        //     } else if (n >= 6 && n <= 20) {
        //         System.out.println("Weird");
        //     } else {
        //         System.out.println("Not Weird");
        //     }
        //     }
            // meatball or trendynumber
        //     
        
        Scanner scanner = new Scanner(System.in);

        // Get input
        System.out.print("Enter room rent per day: ");
        double rentPerDay = scanner.nextDouble();

        System.out.print("Enter number of days stayed: ");
        int numberOfDays = scanner.nextInt();

        System.out.print("Enter month number (1 for January, ..., 12 for December): ");
        int month = scanner.nextInt();

        // Check if it's peak season
        boolean isPeakSeason = (month >= 4 && month <= 6) || (month == 11 || month == 12);

        // Calculate total tariff
        double totalTariff;
        if (isPeakSeason) {
            totalTariff = rentPerDay * 1.2 * numberOfDays; // 20% increase
        } else {
            totalTariff = rentPerDay * numberOfDays;
        }

        // Output result
        System.out.printf("Total Tariff: %.2f\n", totalTariff);

        scanner.close();



    }
}