import java.awt.Graphics;
import java.applet.Applet;
import java.util.Scanner;

/**
 * ___Lab04a____ 
 * @author ___Defne Betül Çiftci____
 * @version ___01.11.2018___
 */ 
public class Lab04a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int i;
      int n;
      int x;
      double k;
      
      // program code
      System.out.println( "Enter a number here: ");
      n = scan.nextInt();
      
      //first code
      i = 0;
      
      while ( i < n) {
         System.out.print( i + " ");
         i = i + 1;
      }
      System.out.println();
      System.out.println();
      
      //second code
      i = 0;
      x = 0;
      
      while ( i < n) {
         System.out.print( i + " ");
         i = i + 1;
         x = x + 1;
         if ( x % 5 == 0)
            System.out.println();
         
      }
      System.out.println();
      System.out.println();
      
      //third code
      i = 0;
      
      while ( i <= n) {
         System.out.print( i + " ");
         i++;
      }
      System.out.println();
      System.out.println();
      
      //fourth code
      i = (-n);
      
      while ( i <= Math.abs(n)) {
         if( i % 2 == 0)
            System.out.print( i + " ");
         i++;
      }
      System.out.println();
      System.out.println();
      
      //fifth code
      i = 0;
      x = 0;
      
      while ( i <= n){
         if ( i % 2 == 0){
            System.out.print( i*i + " ");
            x++;
            if ( x % 5 == 0)
               System.out.println();
         }
         i++;
      }
      System.out.println();
      System.out.println();
      
      //sixth code
      i = 3;
      
      while ( i < n) {
         if ( i % 3 == 0 || i % 4 == 0 && i % 12 != 0)
            System.out.print( i + " ");
         i = i + 1;
      }
      System.out.println();
      System.out.println();
      
      //seventh code
      i = 1;
      while ( i < n) {
         if ( n % i == 0)
            System.out.print( i + " ");
         i++;
      }
      System.out.println();
      System.out.println();
      
      //eighth code
      
      k = 1;
      while ( 1/k > 0.01 && n > 0){
         System.out.printf( "%.2f ", 1/k);
         k = k + 1;
         n = n - 1;
      } 
      
      
   }
   
}


