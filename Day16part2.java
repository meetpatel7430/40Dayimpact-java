public class Day16part2 {
     public static void printAllSubstrings(String str) {
          //sub-string
        int n = str.length();
        for (int i = 0; i < n; i++) {          
            for (int j = i + 1; j <= n; j++) { 
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("All substrings of \"" + input + "\":");
        printAllSubstrings(input);
    }
}
