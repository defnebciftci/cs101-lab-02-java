import java.util.Scanner;

/**
 * ___Lab04b____ 
 * @author ___Defne Betül Çiftci____
 * @version ___01.11.2018___
 */ 
public class Lab04b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // variables
      int n;
      int sum;
      int value;
      int max;
      int min;
      double average;

      // program code
      
      n = 0;
      sum = 0;
      max = -999999999;
      min = 999999999;
      
      while ( n < 100){
         //System.out.println( "Enter a number: ");
         value = scan.nextInt();
         sum = sum + value;
         n++;

         max = Math.max(value, max);
         min = Math.min(value, min);
      }
      average = sum / 100;
      
      System.out.println( "Sum is " + sum + " and count is " + n + " max is " + max + " min is " + min + " average is " + average);
                            

   }

}

