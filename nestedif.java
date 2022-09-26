/*

 */
public class nestedif {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        // Java program to illustrate nested-if statement


  int i = 10;

  if (i == 10 || i<15) {
   // First if statement
   if (i < 15)
    System.out.println("i is smaller than 15");

   // Nested - if statement
   // Will only be executed if statement above
   // it is true
   if (i < 12)
    System.out.println(
     "i is smaller than 12 too");
  } else{
    System.out.println("i is greater than 15");
  }
 }
}

   