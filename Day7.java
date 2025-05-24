import java.util.Scanner;

public class Day7 {

//     public static boolean isCubicSum(long num) {
//         for (int x = -100; x <= 100; x++) {
//             long x3 = (long) x * x * x;
//             for (int y = -100; y <= 100; y++) {
//                 long y3 = (long) y * y * y;
//                 if (x3 + y3 == num) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static int countCubicSums(long[] A) {
//         int count = 0;
//         for (long num : A) {
//             if (isCubicSum(num)) count++;
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         long[] A = {35, 9, 16, 1729, -1, 2};
//         System.out.println("Number of good integers: " + countCubicSums(A));
//     }

 public static void main(String[] args) {
     //evnsum
     //    Scanner scanner = new Scanner(System.in);
     //    System.out.print("Enter the number of elements: ");
     //    int n = scanner.nextInt();
     //    int[] arr = new int[n];
     //    System.out.println("Enter " + n + " integers:");
     //    for (int i = 0; i < n; i++) {
     //        arr[i] = scanner.nextInt();
     //    }
     //    int evenSum = 0;
     //    for (int num : arr) {
     //        if (num % 2 == 0) {
     //            evenSum += num;
     //        }
     //    }
     //    System.out.println("Sum of even numbers: " + evenSum);

     //    scanner.close();

        // oddsum  
     //    Scanner scanner = new Scanner(System.in);
     //    System.out.print("Enter the number of elements: ");
     //    int n = scanner.nextInt();
     //    int[] arr = new int[n];
     //    System.out.println("Enter " + n + " integers:");
     //    for (int i = 0; i < n; i++) {
     //        arr[i] = scanner.nextInt();
     //    }
     //    int oddSum = 0;
     //    for (int num : arr) {
     //        if (num % 2 != 0) {
     //            oddSum += num;
     //        }
     //    }
     //    System.out.println("Sum of odd numbers: " + oddSum);

     //    scanner.close();




          //MIN&MAX
           Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);

        scanner.close();


         




    }
}
