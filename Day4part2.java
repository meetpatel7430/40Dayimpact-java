import java.util.Scanner;
public class Day4part2 {
//     static void toBinary(int n) {
//         if (n > 0) {
//             toBinary(n / 2);
//             System.out.print(n % 2);
//         }
//     }

    public static void main(String[] args) {
     //    Scanner sc = new Scanner(System.in);
     //    System.out.print("Enter a decimal number: ");
     //    int num = sc.nextInt();

     //    if (num == 0)
     //        System.out.print(0);
     //    else
     //    if (num > 0) {
     //      toBinary(num / 2);
     //      System.out.print(num % 2);
     //  }

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a decimal number: ");
     int num = sc.nextInt();

     int[] binary = new int[32]; 
     int index = 0;

     if (num == 0) {
         System.out.println("Binary: 0");
         return;
     }

     while (num > 0) {
         binary[index] = num % 2;
         num = num / 2;
         index++;
     }

     System.out.print("Binary: ");
     for (int i = index - 1; i >= 0; i--) {
         System.out.print(binary[i]);
     } sc.close();
  }
   
           
    }



