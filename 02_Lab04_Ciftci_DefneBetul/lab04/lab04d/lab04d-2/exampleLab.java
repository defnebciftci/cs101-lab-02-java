import java.awt.Graphics;
import java.applet.Applet;
import java.util.Scanner;

/**
 * ___Lab04d2____ 
 * @author ___Defne Betül Çiftci____
 * @version ___25.10.2018___
 */ 
public class exampleLab
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      // Because of the structure of Java, there are supposed to be only 10 decimal places
      //Java code doesn't assume that 0.1 is is 0.1000000 because it assumes that there are other possibilities of decimal places that it can have
      //Thus, the equation never reaches 1.0 and the program never ends
      double d;
      d = 0.1;
      while ( d != 1.0 )
      {
         System.out.println( d);
         d = d + 0.1;
      }
      System.out.println( d + " <- final value after loop!");
   }
}



