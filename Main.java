import java.util.Scanner;

/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
   Scanner input = new Scanner(System.in);
    //asks user to input numbers
    System.out.println("Please enter in two integers, on seperate lines, to divide.");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    
    //finds the quotient without decimals
    int quotient = num1 / num2;

    //finds the remainder
   int remainder = num1 % num2;
   
   // tells user the answer
    System.out.println (num1 + "/" + num2 + " is " + quotient + " with a remainder of " + remainder);
  }
}
