import java.util.Scanner;

public class Day10 {
     public static void main(String[] args) {

         // Decimal to Binary 
     //       Scanner sc = new Scanner(System.in); 
     //    int n = sc.nextInt();                
     //    long binary = 0, place = 1;          

     //    while (n > 0) {
     //        binary += (n % 2) * place;       
     //        n /= 2;                          
     //        place *= 10;                     
     //    }

     //    System.out.println(binary);          
     //    sc.close();




          // Binary to Decimal
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        try {
            int decimal = Integer.parseInt(binary, 2);
            System.out.println("Decimal value: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number.");
        }

        scanner.close();
     }
}
