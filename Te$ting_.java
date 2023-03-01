import java.util.regex.Pattern;

// For Checking if a Java variable, class, or method name is valid or not
public class Te$ting_ {
  public static void main(String[] args) {
    int v4r14613 = 0; // variable declared to prove these are valid
    int v4l1d_n4M3$ = 0;
    String [] regex = {"invalid-name", "1nvalid", "valid_name", "v4l1d_n4M3$", "Va_lid1Clas$", "Te$ting_"};
    String varRegex = "[a-zA-Z$_]+([0-9]|[a-zA-Z$_])*";
    for(int i = 0; i < regex.length; i++) {
      if (Pattern.matches(varRegex, regex[i])) {
        System.out.println(regex[i] + " can be a variable, class, or method name.");
      } else {
        System.out.println(regex[i] + " INVALID variable, class, or method name.");
      }
    }
  }
}

class Va_lid1Clas${

}
