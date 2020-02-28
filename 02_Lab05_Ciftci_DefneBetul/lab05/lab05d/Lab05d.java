import java.util.Scanner;

/**
 * __Lab05d___ 
 * @author __Defne Betül Çiftci___
 * @version __08.11.2018__
 */ 

public class Lab05d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      //variables
      double pi2;
      double piadd;
      int    n;
      double error;
      double pi3;
      
      //program code
      //04.d.1 Output the value of PI as a Java constant
      System.out.println( "The value of PI as a Java constant is " + Math.PI);
      
      System.out.println();
      
      //04.d.2 Compute and report pi to the desired number of terms
      System.out.println( "How many terms do you want to use?");
      n = scan.nextInt();
      pi2 = 0;
      for( double i = 1, j = 0; j < n; i = i + 2 , j++)
      {
         piadd = 4/i;
         if( j % 2 == 0)
         {
            pi2 = pi2 + piadd;
         }
         else
         {
            pi2 = pi2 - piadd;
         }
      }
      System.out.println( "Pi is equal to " + pi2 + " by the formula using " + n + " terms");
      
      System.out.println();
      
      //04.d.3 olmadý :|
      System.out.println( "Please enter an error margin you want");
      error = scan.nextDouble();
      pi3 = 0;
      for( double i = 1; Math.abs( Math.PI - pi3) > error; i++)
      {
         piadd = 4*Math.pow( -1, i + 1)/(2*i - 1);
         pi3 = pi3 + piadd;
      }
      System.out.println( "PI according to the accuracy you want is " + pi3);
      System.out.println( "Error is " + Math.abs( Math.PI - pi3));
   }
}

