import java.util.Scanner;

public class Day17 {
     
     public static void main(String[] args) {

          //company transfers an encrypted
     //      Scanner sc = new Scanner(System.in);
     //    String code = sc.next();
     //    char[] arr = code.toCharArray();

     //    for (int i = 0; i < arr.length - 1; i += 2) {
     //        char temp = arr[i];
     //        arr[i] = arr[i + 1];
     //        arr[i + 1] = temp;
     //    }

     //    System.out.println(new String(arr));
     //    sc.close();
 

     //cycle
//    String s1 = "bike";
//         String s2 = "bikeway";
        
//         StringBuilder extra = new StringBuilder();
//         StringBuilder temp = new StringBuilder(s2);
        
//         for (char c : s1.toCharArray()) {
//             int index = temp.indexOf(c + "");
//             if (index != -1) temp.deleteCharAt(index);
//         }
        
//         if (temp.length() > 0) {
//             System.out.println("cycle " + temp);
//         }




// a game 
//  String input = "1abc23"; 
//         int sum = 0;
//         String temp = "";
//         for (char c : input.toCharArray()) {
//             if (Character.isDigit(c)) {
//                 temp += c; 
//             } else {
//                 if (!temp.isEmpty()) {
//                     sum += Integer.parseInt(temp);
//                     temp = "";
//                 }
//             }
//         }
//         if (!temp.isEmpty()) {
//             sum += Integer.parseInt(temp);
//         }

//         System.out.println(sum);



// Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int[][] mat = new int[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 mat[i][j] = scanner.nextInt();
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(mat[i][j]);
//                 if (j < n - 1) {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("Transpose matrix is:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(mat[j][i]);
//                 if (j < n - 1) {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//         scanner.close();






Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        boolean isUpperTriangular = true;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) { 
                if (matrix[i][j] != 0) {
                    isUpperTriangular = false;
                    break;
                }
            }
            if (!isUpperTriangular) break;
        }

        if (isUpperTriangular) {
            System.out.println("Upper triangular matrix");
        } else {
            System.out.println("Not an Upper triangular matrix");
        }

        scanner.close();

     }
}

