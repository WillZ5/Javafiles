import java.util.*;
class Main {
  public static void main(String[] args) {

    Scanner input= new Scanner(System.in);

    String password = input.nextLine();

    String password1= "abc124@";

    if(password.equals(password1)){
      System.out.println("correct");
    }
    else
    {
      System.out.println("incorrect");
    }
    
    //System.out.println("Hello world!");
  }
}
