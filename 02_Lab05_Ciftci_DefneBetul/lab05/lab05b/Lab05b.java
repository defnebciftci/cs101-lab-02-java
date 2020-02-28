import java.util.Scanner;

/**
 * __Lab05b___ 
 * @author __Defne Betül Çiftci___
 * @version __08.11.2018__
 */ 
public class Lab05b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final int SPACE_PER_CELL = 10;
      
      // variables
      int    row;
      int    col;
      String s;
      String multiplString;
      int    multiplLength;
      String firstString;
      int    firstLength;
      String secString;
      int secLength;
      int iLength;
      String iString;
      int thLength;
      String thString;
      int foLength;
      String foString;
      int iLength2;
      String iString2;
      
      
      // program code
      
      //getting input
      System.out.println( "Enter the row number please");
      row = scan.nextInt();
      
      System.out.println( "Enter the column number please");
      col = scan.nextInt();
      
      //b.1 row, column
      
      System.out.println( "FIRST ASSIGNMENT");
      for ( int i = 1; i <= row; i++)
      {
         for( int j = 1; j <= col; j++)
         {
            firstString = i+","+j;
            firstLength = firstString.length();
            for ( int k = 0; k + firstLength < SPACE_PER_CELL; k++)
            {
               System.out.print ( " ");
            }
            System.out.print( i + "," + j);
         }
         System.out.println();
      }
      
      System.out.println();
      
      //b.2 multiplication table
      
      System.out.println( "SECOND ASSIGNMENT");
      for ( int i = 1; i <= row; i++)
      {
         for( int j = 1; j <= col; j++)
         {
            multiplString = Integer.toString( i*j);
            multiplLength = multiplString.length();
            for ( int m = 0; m + multiplLength < SPACE_PER_CELL; m++)
            {
               System.out.print ( " ");
            }
            System.out.print( i*j);
         }
         System.out.println();
      }
      
      System.out.println();
      
      //b.3 cell numbers
      
      //stringe çevir, i = length, i + 
      
      System.out.println( "THIRD ASSIGNMENT");
      for( int i = 1; i <= row*col; i++)
      {
         thString = Integer.toString( i - 1);
         thLength = thString.length();
         for( int j = 0; j + thLength < SPACE_PER_CELL; j++)
         {
            System.out.print( " ");
         }
         System.out.print( i - 1);
         if( i % col == 0)
         {
            System.out.println();
         }
      }
      
      System.out.println();
      
      //b.4 the row number in the first column only, putting the String "-" into the other cells
      
      System.out.println( "FOURTH ASSIGNMENT");
      for ( int i = 1; i <= row; i++)
      {
         iString2 = Integer.toString( i);
         iLength2 = iString2.length();
         
         for( int m = 0; m + iLength2 < SPACE_PER_CELL; m++)
         {
            System.out.print( " ");
         }
         System.out.print( i);
         for( int j = 0; j < col; j++)
         {
            System.out.print( "         -");
         }
         
         System.out.println();
      }
      
      }

}