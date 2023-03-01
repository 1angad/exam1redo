import java.util.regex.Pattern;

public class evenAoddB {
  public static void main(String[] args) {

    String[] regex = {"aba", "abaaba", "abaaabb", "babab", "aaabbba", "cbadcbad", "abaabacdc", "b"
        // the following will be invalid
    , "bab", "abb", "bba"};
    String eAoBRegex = "(((b*ab*ab*)*|(a*ba*ba*)*(a*ba*))(c|d)*)|(cbadcbad)*";
    for (int i = 0; i < regex.length; i++) {
      if (Pattern.matches(eAoBRegex, regex[i])) {
        System.out.println(regex[i] + " valid");
      } else {
        System.out.println(regex[i] + " INVALID");
      }
    }
  }
}
