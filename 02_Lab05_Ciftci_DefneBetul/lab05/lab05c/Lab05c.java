import java.util.Scanner;

/**
 * __Lab05c___ 
 * @author __Defne Betül Çiftci___
 * @version __08.11.2018__
 */ 
public class Lab05c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      double value;
      double number;
      String operation;
      
      // program code
      value = 0;
      
      System.out.println ( "Welcome to \"SimpleCalc\"...");
      System.out.println ();
      
      do
      {
      System.out.println ( "------------------");
      System.out.println ( "[ " + value + " ]");
      System.out.println ( "------------------");
      System.out.println ( "  +,-,*,/ value");
      System.out.println ( "  Clear");
      System.out.println ( "  Quit");
      System.out.println ( "------------------");
      System.out.println ( "Select:");
      
      operation = scan.next();
      
      //calculator
      if ( operation.charAt(0) == '+')
      {
         number = scan.nextInt();
         value = value + number;
      }
      else if ( operation.charAt(0) == '-')
      {
         number = scan.nextInt();
         value = value - number;
      }
      else if ( operation.charAt(0) == '*')
      {
         number = scan.nextInt();
         value = value * number;
      }
      else if ( operation.charAt(0) == '/')
      {
         number = scan.nextInt();
         value = value / number;
      }
      //the user enters clear
      else if ( operation.equals( "c") || operation.equals( "C"))
      {
         value = 0;
      }
      //the user enters an invalid value
      else if ( !operation.equals( "q") || !operation.equals( "Q") || operation.equals( "quit") || operation.equals( "Quit"))
      {
         System.out.println( "Please enter a valid operation");
      }
      } while ( !operation.equals( "q") && !operation.equals( "Q") && operation.equals( "quit") && operation.equals( "Quit"));
      
      System.out.println( "Thank you for using \"SimpleCalc\", goodbye.");
      
   }
   
}