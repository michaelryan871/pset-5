/**
 * Problem Set 5.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Your code must meet the
 * requirements set forth in this section, and must support all possible values
 * that might be passed into your methods.
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet5 {

    public static void main(String[] args) {
      ProblemSet5 ps = new ProblemSet5();

      // comment out or uncomment as needed

      //Working//System.out.println(ps.surroundMe("cde", "abfg"));
      //Working//System.out.println(ps.endsMeet("abcdefg", 2));
      //Working//System.out.println(ps.middleMan("abcdefg"));
      //Working//System.out.println(ps.isCentered("abcdefg", "cde"));
      //Working//System.out.println(ps.countMe("I am an example sentence", 'e'));
      //System.out.println(ps.triplets("aaabbbccc"));
      //System.out.println(ps.addMe("123 abc 123"));
      //System.out.println(ps.sequence());
      //Working//System.out.println(ps.intertwine("abc", "12345"));
      //Working//System.out.println(ps.isPalindrome("racecar"));

    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

    public String surroundMe(String in, String out) {
      if (in == null || out == null || out.length() != 4){
        return in;
      }

      String outStart = out.substring(0,2);
      String outEnd = out.substring(2,4);

      return outStart + in + outEnd;

    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */

    public String endsMeet(String text, int n) {
      if (text == null || text.length() > 10 || text.length() < 1 || n < 1 || n > text.length()){
        return text;
      }

      String textStart = text.substring(0, n);
      String textEnd = text.substring(text.length() - n, text.length());

      return textStart + textEnd;

    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */

    public String middleMan(String text) {
      if (text == null || text.length() <= 2 || text.length() % 2 == 0){
        return text;
      }

      int stringLength = text.length();
      String middleText = text.substring(stringLength/2 - 1, stringLength/2 + 2);

      return middleText;
 }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */

    public boolean isCentered(String text, String target) {
      if (text == null || target == null || target.length() != 3 || text.length() <= 2 || text.length() % 2 == 0){
        boolean isCentered = false;
        return isCentered;
      }


      int stringLength = text.length();
      String middleText = text.substring(stringLength/2 - 1, stringLength/2 + 2);

    if (middleText.equals(target)){
      boolean isCentered = true;
      return isCentered;
    } else {
      boolean isCentered = false;
      return isCentered;
    }

  }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */

    public int countMe(String text, char suffix) {
      if (text == null || !Character.isAlphabetic(suffix)){
        return -1;
      }

      int count = 0;

      for (int i = 0; i < text.length() -1; i++){
        if (text.charAt(i + 1) == ' ' && text.charAt(i) == suffix){
          count++;
        }
      }

      if (text.charAt(text.length() -1) == suffix){
        count ++;
      }

      return count;

   }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */

    public int triplets(String text) {
      if (text == null){
        return -1;
   }

   return -1;
     }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */

     public long addMe(String text) {
       if (text == null){
         return -1;
       }

      return -1;

    }


    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */

    public long sequence(String text) {
      if (text == null){
        return -1;
      }
      return -1;
   }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */

    public String intertwine(String a, String b) {
      if ( a == null || b == null){
        return null;
      }

      StringBuilder intertwined = new StringBuilder();
      for (int i = 0; i < a.length() || i < b.length(); i++){
        if(i < a.length()){
          intertwined.append(a.charAt(i));
        }
        if(i < b.length()){
          intertwined.append(b.charAt(i));
        }
      }
      return intertwined.toString();
   }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */

     public boolean isPalindrome(String text) {
          boolean isPalindrome = false;
           if (text == null){
              isPalindrome = false;
              return isPalindrome;
           }

           String reverse = "";

           int length = text.length();

           for (int i = length - 1; i >= 0; i--)
             reverse = reverse + text.charAt(i);


           if (text.equals(reverse)) {
                   isPalindrome = true;
     }
     return isPalindrome;
   }
}
