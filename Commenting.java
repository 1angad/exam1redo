public class Commenting {
  public static void main(String[] args) {

    String input = "/*This is a valid multiline comment*/";

    States current = States.a;
    for(int i = 0; i < input.length(); i++){
      switch(current){
        case a:
          if(input.charAt(i)== '/'){
            current = States.b;
          } else {
            current = States.f;
          }
          break;
        case b:
          if(input.charAt(i)== '*'){
            current = States.c;
          } else {
            current = States.f;
          }
          break;
        case c:
          if(input.charAt(i)== '*'){
            current = States.d;
          }
          break;
        case d:
          if(input.charAt(i)== '/'){
            current = States.e;
          } else if(input.charAt(i)== '*'){}
          else{
            current = States.c;
          }
          break;
        case e:
          current = States.f;
          break;
        case f:
      }
    }
    if(current == States.e) {
      System.out.println("The comment is valid");
    } else {
      System.out.println("The comment is NOT valid");
    }
  }
}

enum States {
  a,
  b,
  c,
  d,
  e,
  f
}
