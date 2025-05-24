import java.util.Scanner;

public class Day13 {
     public static void main(String[] args) {
          //to check if i th bit is setbit or not(right shift).
     //      Scanner scanner = new Scanner(System.in);
     //    System.out.print("Enter a number: ");
     //    int number = scanner.nextInt();
     //    System.out.print("Enter the bit position to check (0-based): ");
     //    int i = scanner.nextInt();
     //    if (((number >> i) & 1) == 1) {
     //        System.out.println("The " + i + "-th bit is SET (1).");
     //    } else {
     //        System.out.println("The " + i + "-th bit is NOT SET (0).");
     //    }
     //    scanner.close();

               //making i th bit as set bit
     //      Scanner scanner = new Scanner(System.in);
     //    System.out.print("Enter a number: ");
     //    int number = scanner.nextInt();
     //    System.out.print("Enter the bit position to make set (0-based): ");
     //    int i = scanner.nextInt();
     //    System.out.println("Original number in binary: " + Integer.toBinaryString(number));
     //    int result = number | (1 << i);
     //    System.out.println("Modified number: " + result);
     //    System.out.println("Modified number in binary: " + Integer.toBinaryString(result));
     //    scanner.close();


               //bit position to clear
     Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the bit position to clear (0-based): ");
        int i = scanner.nextInt();
        System.out.println("Original number in binary: " + Integer.toBinaryString(number));
        int result = number & ~(1 << i);
        System.out.println("Modified number: " + result);
        System.out.println("Modified number in binary: " + Integer.toBinaryString(result));

        scanner.close();


















     }
}
