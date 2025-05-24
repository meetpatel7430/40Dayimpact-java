import java.util.Scanner;

public class Day16 {
     public static void main(String[] args) {
     //      String o1 = "abc";
     //    int n = o1.length();
     //    long count = (long) Math.pow(2, n);
     //    System.out.println("Total subsequences: " + count);

      Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        String s = scanner.nextLine();
        scanner.close();

        System.out.println(isSubsequence(t, s));
     }

     public static int isSubsequence(String t, String s) {
        int i = 0, j = 0;
        while (i < t.length() && j < s.length()) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
            i++;
        }
        return (j == s.length()) ? 1 : 0;
    }
}
