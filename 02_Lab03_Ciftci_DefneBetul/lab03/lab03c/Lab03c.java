import java.nio.file.*;   
import java.io.*;
import java.util.Scanner;

/**
 * __Lab03c___modifications to website___ 
 * @author __Nur Çiftci___
 * @version __25.10.2018__
 */ 
public class Lab03c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final String DOCTYPE      = " <!DOCTYPE html>";
      final String HTML         = "<html>";
      final String HTMLEND      = "</html>";
      final String HEAD         = "<head>";
      final String HEADEND      = "</head>";
      final String TITLE        = "<title>";
      final String TITLEEND     = "</title>";
      final String BODY         = "<body>";
      final String BODYEND      = "</body>";
      final String HR           = "<hr>";
      final String HEADER1      = "<h1>";
      final String HEADER1END   = "</h1>";
      final String PARAGRAPH    = "<p>";
      final String PARAGRAPHEND = "</p>";
      final String IMGSRC       = "<img src=";
      final String JPG          = ".jpg>";
      final double TAXRATE1     = 5/100;
      final double TAXRATE2     = 15/100;
      final double TAXRATE3     = 25/100;

      
      // variables
      String name;
      int age;
      double salary;
      String comment;
      String tax;

      
      // program code
      System.out.println( "Please enter employee's name: "   );
      name = scan.next();
      
      System.out.println( "Please enter employee's age: "    );
      age = scan.nextInt();
      if ( age <= 0)
         System.out.println( "Please enter a positive integer");
      else
      {
         System.out.println( "Please enter employee's salary: " );
         salary = scan.nextDouble();
         
         if ( salary <= 0 || salary >= 10000)
            System.out.println ( "Please enter a number between 0 and 10000");
         else
         {
            if ( salary < 1000)
            {
               salary = (salary - 100) - (salary - 100)*TAXRATE1;
               tax = "5%";
            }
            else if ( salary > 5000)
            {
               salary = (salary - 100) - (salary - 100)*TAXRATE3;
               tax = "25%";
            }
            else
            {
               salary = (salary - 100) - (salary - 100)*TAXRATE2;
               tax = "15%";
            }
            
            System.out.println( "Please enter employee's comment: ");
            comment = scan.nextLine();
            comment = scan.nextLine();
      
      
            System.out.println( DOCTYPE);
            System.out.println( "");
            System.out.println( HTML);
            System.out.println( "");
            System.out.println( HEAD);
            System.out.println( TITLE + name + "'s Home Page" + TITLEEND);
            System.out.println( HEADEND);
            System.out.println( "");
            System.out.println( BODY);
            System.out.println( "");
            System.out.println( HR);
            if (Files.exists( Paths.get( name + ".jpg" ) ))
               System.out.println( IMGSRC + name + JPG);
            System.out.println( HEADER1 + name + HEADER1END);
            System.out.println( PARAGRAPH + "Age: " + age + PARAGRAPHEND);
            System.out.println( PARAGRAPH + "Net Salary (Tax Rate: " + tax + "): " + salary + PARAGRAPHEND);
            System.out.println( PARAGRAPH + "Comments: " + comment + PARAGRAPHEND);
            System.out.println( HR);
            System.out.println( "");
            System.out.println( BODYEND);
            System.out.println( "");
            System.out.println( HTMLEND);
         }
      
         
      
      }
      
      

   }

} // end class