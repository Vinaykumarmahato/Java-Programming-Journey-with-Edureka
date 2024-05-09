import java.util.Scanner;

public class testFunctions
{
   //function to return square of a given number.
  static int  square (int x)
   {
      int y = x * x;
       return y;
}
  public static void main (String args[])
  {
     Scanner sc = new Scanner (System.in);
 System.out.println ("Please enter a number...");
 int n = sc.nextInt(); 
 int result = testFunctions.square (n);
 System.out.println ("Square of " + n + " is " + result);
    }
  }