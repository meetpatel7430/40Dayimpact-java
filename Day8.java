import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day8 {
     public static void main(String[] args) {

          //bus 
     //       Scanner scanner = new Scanner(System.in);
        
     //    System.out.println("Enter no of Groups :");
     //    int n = scanner.nextInt();
     //    System.out.println("Enter Bus Capacity :");
     //    int m = scanner.nextInt();
         
     //    System.err.println("Enter the No of Members:");
     //    int[] a = new int[n];
     //    for (int i = 0; i < n; i++) {
     //        a[i] = scanner.nextInt();
     //    }

     //    int busCount = 1;  
     //    int currentLoad = 0;

     //    for (int i = 0; i < n; i++) {
     //        if (currentLoad + a[i] <= m) {
     //            currentLoad += a[i];  
     //        } else {
     //            busCount++;           
     //            currentLoad = a[i];   
     //        }
     //    }

     //    System.out.println("Total no of Bus required:"+busCount);
     //    scanner.close();





          //max height max weight
     // Scanner scanner = new Scanner(System.in);

     //    System.out.println("Enter height and weight pairs (e.g., 170 65 180 75 ...):");
     //    String[] inputValues = scanner.nextLine().trim().split(" ");

     //    if (inputValues.length % 2 != 0 || inputValues.length == 0) {
     //        System.out.println("Invalid input: Please enter complete pairs of height and weight.");
     //        return;
     //    }

     //    int[] heightsAndWeights = new int[inputValues.length];
     //    for (int i = 0; i < inputValues.length; i++) {
     //        heightsAndWeights[i] = Integer.parseInt(inputValues[i]);
     //    }

     //    int maxHeight = Integer.MIN_VALUE;
     //    int personWithMaxHeight = -1;
     //    int maxWeight = Integer.MIN_VALUE;
     //    int personWithMaxWeight = -1;
     //    int personIndex = 1; 
     //    for (int i = 0; i < heightsAndWeights.length; i += 2) {
     //        int height = heightsAndWeights[i];
     //        int weight = heightsAndWeights[i + 1];
     //        if (height > maxHeight) {
     //            maxHeight = height;
     //            personWithMaxHeight = personIndex;
     //        }
     //        if (weight > maxWeight) {
     //            maxWeight = weight;
     //            personWithMaxWeight = personIndex;
     //        }

     //        personIndex++; 
     //    }
     //    System.out.println(personWithMaxHeight + " " + personWithMaxWeight);
     //    scanner.close();



     Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        for (int even : evenNumbers) {
            System.out.print(even + " ");
        }
        for (int odd : oddNumbers) {
            System.out.print(odd + " ");
        } scanner.close();





     }
}
