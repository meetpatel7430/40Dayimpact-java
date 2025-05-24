import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Day15 {
     public static void main(String[] args) {
          // first non repeating element
     //      String str = "swiss";
     //    int[] freq = new int[256]; 
     //    for (int i = 0; i < str.length(); i++) {
     //        freq[str.charAt(i)]++;
     //    }
     //    for (int i = 0; i < str.length(); i++) {
     //        if (freq[str.charAt(i)] == 1) {
     //            System.out.println("First non-repeating character: " + str.charAt(i));
     //            return;
     //        }
     //    }
     //    System.out.println("No non-repeating character found.");



               //Antakshari
     // Scanner scanner = new Scanner(System.in);
     //    List<String> validChain = new ArrayList<>();
     //    Set<String> usedWords = new HashSet<>();
     //    String prevWord = null;
     //    while (true) {
     //        String word = scanner.nextLine();

     //        if (word.equals("####")) {
     //            break;
     //        }
     //        word = word.trim().toLowerCase();
     //        if (usedWords.contains(word)) {
     //            continue;
     //        }
     //        if (prevWord == null || word.charAt(0) == prevWord.charAt(prevWord.length() - 1)) {
     //            validChain.add(word);
     //            usedWords.add(word);
     //            prevWord = word;
     //        }
     //    }
     //    for (String word : validChain) {
     //        System.out.println(word);
     //    }

     //    scanner.close();


               //revers string
     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            result.append(reversed.reverse()).append(" ");
        }
        System.out.println("Reversed each word:");
        System.out.println(result.toString().trim());

        scanner.close();






        
     }
}
