import java.util.regex.Pattern;
public class IntegerCheck {
  public static void main(String[] args) {
    String [] regex = {"2000000022l", "4000000024u", "04000000024u",
        "02000000022l", "0x4a44000000000020I64", "0x8a44000000000040Ui64"};
    String intRegex = "(0[xX][0-9a-fA-F]+|[0-7]*|[1-9][0-9]*)(u|U|l|L)?(I64|i64)?";
    for (String s : regex) {
      if (Pattern.matches(intRegex, s)) {
        System.out.println(s + " is a valid integer.");
      } else {
        System.out.println(s + " is not a valid integer.");
      }
    }
  }
}