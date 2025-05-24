import java.util.Scanner;

public class Day12 {
     public static void main(String[] args) {
          //to check if i th bit is setbit or not(left shift).
           Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the bit position to check (0-based): ");
        int i = scanner.nextInt();

       
        int mask = 1 << i;

       
        if ((number & mask) != 0) {
            System.out.println("The " + i + "-th bit is SET (1).");
        } else {
            System.out.println("The " + i + "-th bit is NOT SET (0).");
        }

        scanner.close();
     }
}
