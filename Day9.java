import java.util.Arrays;
import java.util.Scanner;

public class Day9 {
          // Oil factory problem.
 
     public static void main(String[] args) {
          // Scanner scan = new Scanner(System.in);
		
		// int numContainers = scan.nextInt();
		// int[] cont = new int[numContainers];
		// for(int i=0;i<numContainers; i++) {
		// 	cont[i] = scan.nextInt();
		// }
		// for(int i=0;i<numContainers-1;i++) {
		// 	for(int j=i+1;j<numContainers;j++) {
		// 		if(cont[i]>cont[j]) {
		// 			int temp = cont[i];
		// 			cont[i] = cont[j];
		// 			cont[j] = temp;
		// 		}
		// 	}
		// }
		// int mid = numContainers/2; 
		// int n = numContainers-1; 
		
		// for(int i=0; i<mid; i++) {
		// 	System.out.println(cont[n]+" "+cont[i]); 
		// 	n--;
		// }
		
		// if(numContainers%2 != 0) {
		// 	System.out.println(cont[mid]+" 0");
		// } scan.close();
        




          //move zero at the end of integer.
//       Scanner sc = new Scanner(System.in);

//         int t = sc.nextInt();  
//         while (t-- > 0) {
//             int n = sc.nextInt();  
//             fun(n);
//         }

//         sc.close();
//     }
//     public static void fun(int n) {
//         int zeroCount = 0;
          
//         while (n > 0) {
//             int digit = n % 10;
//             if (digit == 1) {
//                 System.out.print(digit); 
//             } else {
//                 zeroCount++;             
//             }
//             n /= 10;
//         }
        
//         for (int i = 0; i < zeroCount; i++) {
//             System.out.print(0);
//         }

//         System.out.println(); 



 // even no. on left and odd no. on right.
// Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         segregateEvenOdd(arr);

//         System.out.println("Array after segregation (evens first):");
//         System.out.println(Arrays.toString(arr));

//         sc.close();
//     }

//     public static void segregateEvenOdd(int[] arr) {
//         int left = 0, right = arr.length - 1;

//         while (left < right) {
           
//             while (left < right && arr[left] % 2 == 0) {
//                 left++;
//             }

//             while (left < right && arr[right] % 2 != 0) {
//                 right--;
//             }

//             if (left < right) {
//                 int temp = arr[left];
//                 arr[left] = arr[right];
//                 arr[right] = temp;
//                 left++;
//                 right--;
//             }
//        }


//find the smallest positive number missing from the array.
Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int i = 1;
        while (i <= n) {
            boolean found = false;

            for (int j = 0; j < n; j++) {
                if (a[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(i);
                return;
            }

            i++;
        }
        System.out.println(n + 1);
        sc.close();





     }
 }


