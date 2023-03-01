import java.util.regex.Pattern; // 9
public class FloatingPoint { // 4
  public static void main(String[] args) { //11
    String [] pattern = {"25E-4", "0.0", "0.", ".0", "0e+10", "0e-10",
        "25E-4", "15.75L", "1.575E1", "-2.5e-3F"}; // 27
    String floatRegex = "[+\\-]?([0-9]*\\.[0-9]+|[0-9]+\\.)([eE][+\\-]?[0-9]+)?[LlFf]?|[+\\-]?[0-9]+([eE][+\\-]?)?[0-9]+[LlFf]?"; // 5
    for (String s : pattern) { // 8
      if (Pattern.matches(floatRegex, s)) { // 12
        System.out.println(s + " is a valid float"); // 11
      } else { // 3
        System.out.println(s + " is an INVALID float"); // 11
      } //1
    } //1
  } //1
} //1

// 105 lexems
