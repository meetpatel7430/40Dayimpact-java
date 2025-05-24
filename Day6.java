import java.util.Scanner;

public class Day6 {
     public static void main(String[] args) {
          // Arrays are Compatible or Not
     //       Scanner scanner = new Scanner(System.in);
     //    System.out.print("Enter the size of the arrays: ");
     //    int size = scanner.nextInt();

     //    int[] array1 = new int[size];
     //    int[] array2 = new int[size];

     //    System.out.println("Enter elements of the first array:");
     //    for (int i = 0; i < size; i++) {
     //        array1[i] = scanner.nextInt();
     //    }

     //    System.out.println("Enter elements of the second array:");
     //    for (int i = 0; i < size; i++) {
     //        array2[i] = scanner.nextInt();
     //    }

     //    boolean compatible = true;
     //    for (int i = 0; i < size; i++) {
     //        if (array1[i] < array2[i]) {
     //            compatible = false;
     //            break;
     //        }
     //    }

     //    if (compatible) {
     //        System.out.println("Arrays are Compatible");
     //    } else {
     //        System.out.println("Arrays are Not Compatible");
     //    }

     //    scanner.close();




      Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = scanner.nextInt();

        if (size != 5) {
            System.out.println("Game Over: Array size must be 5.");
            return;
        }

        int[] array = new int[size + 1]; 
        System.out.println("Enter " + size + " card values:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the position to insert (0 to " + size + "): ");
        int position = scanner.nextInt();

        if (position < 0 || position > size) {
            System.out.println("Game Over: Invalid position.");
            return;
        }

        System.out.print("Enter the card value to insert: ");
        int newCard = scanner.nextInt();

        for (int i = size; i > position; i--) {
            array[i] = array[i - 1];
        }

        array[position] = newCard;

        System.out.println("Cards after insertion:");
        for (int i = 0; i <= size; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();





















     }
}
