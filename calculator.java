//PROGRAM TO CREATE THE ARITHMETIC CALCULATOR
import java.util.Scanner;
class Main {
  public static void main(String[] args) {

Scanner input1= new Scanner(System.in);
    Scanner input2= new Scanner(System.in);
     Scanner input3= new Scanner(System.in);

    System.out.println("Enter two numbers");
    int num1= input1.nextInt();
     int num2= input2.nextInt();
    

   System.out.println("Enter the choices");
    System.out.println("Enter 1 for addition " +"\n"+ "Enter 2 for subtraction" +"\n"+ "Enter 3 for multiplication"+"\n"+"Enter 4 for division");
    int num3=input3.nextInt();
   
    //int a=5;


    // Evaluating the expression that will return true or false
    switch (num3) {
      case 1:
        
        System.out.println("Addition is "+(num1+num2));
        break;
      case 2:
        System.out.println("Subtraction is "+ (num1-num2));
        break;
      case 3:
        System.out.println("Multiplication is "+ (num1*num2));
        break;
      case 4:
        System.out.println("Division is "+ (num1/num2));
        break;
      default:
        System.out.println("Some other choice");
        break;
    }

    //System.out.println("Hello world!");
  }
}
