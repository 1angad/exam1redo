import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    String array[] = {"c#u!moja1@gsu.edu", "asingh1@student.gsu.edu", "1angad@student--mail.com",
        "wrongemail-gmail.com", "@wrongemail-gmail.com", ".wrongemail-gmail.com."};

    checkIt(array);

  }

  public static void checkIt(String array[]){
    String localRegex = "[a-zA-Z0-9#!%`$&+/=?^_'{|}~*\\-]+(\\.[a-zA-Z0-9#!%`$&+/=?^_'{|}~*\\-])*";
    String domainRegex = "[a-zA-Z0-9]+(\\-)*(.[a-zA-Z0-9]+)+";
    String email = localRegex + "@" + domainRegex;
    for(int i = 0; i < array.length; i++){
      if(Pattern.matches(email, array[i])) {
        System.out.println(array[i] + " is a valid email address");
      } else {
        System.out.println(array[i] + " is an INVALID email address");
      }
    }
  }
}