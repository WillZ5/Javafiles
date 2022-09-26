

  import java.util.Scanner;

public class scannerclass {

 
    public static void main(String args[]) {
    
    Scanner in = new Scanner(System.in);

    System.out.println("Enter your name: ");
    System.out.println("input");
    // takes input from the keyboard
    String name = in.nextLine();
    //System.out.println("hello");
            

    // prints the name
    System.out.println("My name is " + name);

    // closes the scanner
   // Scanner.close();
  
        
        
    }
}
