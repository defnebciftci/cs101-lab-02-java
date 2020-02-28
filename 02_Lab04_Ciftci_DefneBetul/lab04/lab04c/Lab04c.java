import java.util.Scanner;

/**
 * ___Lab04c____ 
 * @author ___Defne Betül Çiftci____
 * @version ___01.11.2018___
 */ 
public class Lab04c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      int n;
      int sum;
      int count;
      double average;
      int max;
      int min;
      max = -999999999;
      min = 999999999;

      // program code
      sum = 0;
      count = 0;
      
      //gets n as input until it's negative
      n = scan.nextInt();
      while ( n >= 0){
         sum = sum + n;
         count++;
         
         //finding max and min excluding negative
         max = Math.max(n, max);
         min = Math.min(n, min);
         
         n = scan.nextInt();
      }
      
      average = sum / count;
      
      
      System.out.println( "average is " + average + " max is " + max + " min is " + min);
   }

}

