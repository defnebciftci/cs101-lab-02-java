import java.util.Scanner;

/**
 * __Lab05a___ 
 * @author __Defne Betül Çiftci___
 * @version __08.11.2018__
 */ 
public class Lab05a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int width;
      int height;
      int thickness;
      String answer;
      
      // program code
      System.out.println ( "Welcome to \"Rectangle Creator\"...");
      
      do
      {
         do
         {
            //getting inputs
            System.out.println( "Enter a width please");
            width = scan.nextInt();
            
            System.out.println( "Enter a height please");
            height = scan.nextInt();
            
            System.out.println( "Enter a thickness please");
            thickness = scan.nextInt();
            if( width <= 0 || height <= 0 || thickness <= 0)
               System.out.println ( "Error: all values must be positive!" );
         } while ( width <= 0 || height <= 0 || thickness <= 0);
         
         //pattern for rectangle with hole
         if ( height > 2*thickness)
         {
            for ( int i = 0; i < thickness; i++)
            {
               for ( int j = 0; j < width; j++)
               {
                  System.out.print ( "*");
               }
               System.out.println();
            }
            
            for ( int i = 0; i < height - 2*thickness; i++)
            {
               for ( int j = thickness; j > 0; j--)
               {
                  System.out.print ( "*");
               }
               for ( int k = width - 2*thickness; k > 0; k--)
               {
                  System.out.print ( " ");
               }
               for ( int m = thickness; m > 0; m--)
               {
                  System.out.print ( "*");
               }
               System.out.println();
            }
            
            for ( int i = 0; i < thickness; i++)
            {
               for ( int j = 0; j < width; j++)
               {
                  System.out.print ( "*");
               }
               System.out.println();
            }
         }
         //pattern for rectangle without a hole
         else
         {
            for ( int i = 0; i < height; i++)
            {
               for ( int j = 0; j < width; j++)
               {
                  System.out.print ( "*");
               }
               System.out.println();
            }
            System.out.println ( "Oops... no hole!");
         }
         
         //code for asking the user for a new pattern
         System.out.println( "Do you wish to create another pattern?");
         answer = scan.next();
         
      }while ( answer.equals( "y") || answer.equals( "Y"));
      
   }
   
} //end code