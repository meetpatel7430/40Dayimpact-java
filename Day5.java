public class Day5 {
     public static void main(String[] args) {
          //pyramid pattern
          // int rows = 4; 
          // for (int i = 1; i <= rows; i++) {
              
          //     for (int j = 1; j <= rows - i; j++) {
          //         System.out.print("  ");
          //     }
             
          //     for (int k = 1; k <= 2 * i - 1; k++) {
          //         System.out.print("* ");
          //     }
             
          //     System.out.println();
          // }



     //      int rows = 5; 

     //    for (int i = 1; i <= rows; i++) {
            
     //        for (int j = 1; j <= rows - i; j++) {
     //            System.out.print("  "); 
     //        }
     //        for (int k = 1; k <= i; k++) {
     //            System.out.print("* "); 
     //        }
     //        System.out.println();
     //      }



          // int rows = 5; 
          // for (int i = 1; i <= rows; i++) {
          //     for (int j = 1; j <= rows - i; j++) {
          //         System.out.print("* "); 
          //     }
          //     for (int k = 1; k <= i; k++) {
          //         System.out.print("  "); 
          //     }
          //     System.out.println();
          //   }


          //   int rows = 5;
          //   for (int i = rows; i >= 1; i--) { 
          //       for (int j = 1; j <= rows - i; j++) { 
          //           System.out.print("  ");
          //       }
          //       for (int k = 1; k <= i; k++) { 
          //           System.out.print("* ");
          //       }
          //       System.out.println();
          //   }


     //      int n = 5;
     //      for (int i = 1; i <= n; i++) {
     //          printStars(i);
     //      }
     //      for (int i = n - 1; i >= 1; i--) {
     //          printStars(i);
     //      }
     //  }
     //  public static void printStars(int count) {
     //      for (int i = 0; i < count; i++) {
     //          System.out.print("* ");
     //      }
     //      System.out.println();




     // int n = 5;

     //    for (int i = 1; i <= n; i++) {
     //        for (int j = 1; j <= n; j++) {
     //            if (i == 1 || i == n || j == 1 || j == n) {
     //                System.out.print("* ");
     //            } else {
     //                System.out.print("  "); 
     //            }
     //        }
     //        System.out.println();
     //    }


     int rows = 4;
      for (int i = 1; i <= rows; i++) { 
         for (int j = 1; j <= rows - i; j++) {
             System.out.print("  ");
         }
         for (int k = 1; k <= 2 * i - 1; k++) {
             System.out.print("* ");
         }
         System.out.println();
     }
     for (int i = rows; i >= 1; i--) {
         for (int j = 1; j <= rows - i; j++) {
             System.out.print("  ");
         }
         for (int k = 1; k <= 2 * i - 1; k++) {
             System.out.print("* ");
         }
         System.out.println();
     }

      }
}




