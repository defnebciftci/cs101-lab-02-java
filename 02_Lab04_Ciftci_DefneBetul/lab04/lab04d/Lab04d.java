import java.util.Scanner;

/**
 * ___Lab02a____ 
 * @author ___Defne Betül Çiftci____
 * @version ___25.10.2018___
 */ 
public class Lab04d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      char ch;
      int width;
      int i;
      int j;
      
      // program code
      
      //getting inputs
      System.out.println( "Enter a character: " );
      ch = scan.next().charAt(0);
      
      System.out.println( "Enter the width: ");
      width = scan.nextInt();
      
      i = 1;
      j = 4;
      
      //forming a triangle
      while ( i <= width){
         i++;
         while ( j < 5){
            System.out.print( ch);
            j++;
         }
         System.out.println();
         j = j - i;
         
         
      }
   }
   
}

