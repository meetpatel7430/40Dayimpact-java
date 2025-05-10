import java.util.Scanner;

public class Daytwopart2 {
    public static void main(String [] args) {
     // specialnumber
     //    Scanner sc = new Scanner(System.in);
     //    int first_value = sc.nextInt();
     //    int last_value = sc.nextInt();
     //    for(int number=first_value; number<=last_value; number++){
     //        int digit1=number/10;
     //        int digit2=number%10;
     //        int sum=digit1+digit2;
     //        int product=digit1*digit2;
     //        if((sum+product)== number){
     //            System.out.println(number);
     //            sc.close();
     //        }
     //    }



     //Fibonacci series
     // Scanner scanner = new Scanner(System.in);
     // System.out.print("Enter the month number: ");
     // int month = scanner.nextInt();

     // int first = 0, second = 1, result = 0;

     // if (month == 1) {
     //     result = 0;
     // } else if (month == 2) {
     //     result = 1;
     // } else {
     //     for (int i = 3; i <= month; i++) {
     //         result = first + second;
     //         first = second;
     //         second = result;
     //     }
     // }

     // System.out.println("Amoeba size in month " + month + " is: " + result);
     // scanner.close();




     //collatz sequence
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a positive number: ");
     int n = scanner.nextInt();

     if (n <= 0) {
         System.out.println("Please enter a positive integer.");
     } else {
         System.out.print("Collatz sequence: ");
         while (n != 1) {
             System.out.print(n + " ");
             if (n % 2 == 0) {
                 n = n / 2;
             } else {
                 n = 3 * n + 1;
             }
         }
         System.out.println(1);  
     }
     scanner.close();


    }
    
}


     