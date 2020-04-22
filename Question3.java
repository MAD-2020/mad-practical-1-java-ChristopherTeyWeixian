import java.util.Scanner;

public class Question3
{
 public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter integer to multiply by itself:"); 
    
    double number= in.nextInt(); 
    double result=number*number; 
    /*calculation*/
      
    System.out.print("Result is "+result);
    
  }
}
