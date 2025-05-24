public class Day14 {
     public static void main(String[] args) {
          //find non repeating elements.
     //       int[] arr = {2, 3, 5, 4, 5, 3, 4};
     //    int result = 0;
     //    for (int num : arr) {
     //        result ^= num; 
     //    }
     //    System.out.println("Non-repeating element: " + result);


     //conut of vowel
    //  String input = "Vamc is the bad boy!";
    //     int vowelCount = countVowels(input);
    //     System.out.println("Number of vowels: " + vowelCount); 
    //  }
    //     public static int countVowels(String str) {
    //     int count = 0;
    //     String vowels = "aeiouAEIOU";

    //     for (int i = 0; i < str.length(); i++) {
    //         if (vowels.indexOf(str.charAt(i)) != -1) {
    //             count++;
    //         }
    //     }

    //     return count;


            //Palidrome
         String s = "MORAX";
        String  r = new StringBuilder(s).reverse().toString();
        if(r.equals(s)){
            System.out.println("Palidrome");
        }
        else{
           System.out.println("Not Palidrome");
        }

        
     }
}
