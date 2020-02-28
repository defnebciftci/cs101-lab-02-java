import java.util.Scanner;

/**
 * __Lab02e___ 
 * @author __Nur Çiftci___
 * @version __18.18.2018__
 */ 
public class Lab02e
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final String doctype      = " <!DOCTYPE html>";
      final String html         = "<html>";
      final String htmlEnd      = "</html>";
      final String head         = "<head>";
      final String headEnd      = "</head>";
      final String title        = "<title>";
      final String titleEnd     = "</title>";
      final String body         = "<body>";
      final String bodyEnd      = "</body>";
      final String hr           = "<hr>";
      final String header1      = "<h1>";
      final String header1End   = "</h1>";
      final String paragraph    = "<p>";
      final String paragraphEnd = "</p>";

      
      // variables
      String name;
      int age;
      double salary;
      String comment;

      
      // program code
      System.out.println( "Please enter employee's name: "   );
      name = scan.next();
      
      System.out.println( "Please enter employee's age: "    );
      age = scan.nextInt();
      
      System.out.println( "Please enter employee's salary: " );
      salary = scan.nextDouble();
      
      System.out.println( "Please enter employee's comment: ");
      comment = scan.nextLine();
      comment = scan.nextLine();
      
      
      System.out.println( doctype);
      System.out.println( "");
      System.out.println( html);
      System.out.println( "");
      System.out.println( head);
      System.out.println( title + name + "'s Home Page" + titleEnd);
      System.out.println( headEnd);
      System.out.println( "");
      System.out.println( body);
      System.out.println( "");
      System.out.println( hr);
      System.out.println( header1 + name + header1End);
      System.out.println( paragraph + "Age: " + age + paragraphEnd);
      System.out.println( paragraph + "Salary: " + salary + paragraphEnd);
      System.out.println( paragraph + "Comments: " + comment + paragraphEnd);
      System.out.println( hr);
      System.out.println( "");
      System.out.println( bodyEnd);
      System.out.println( "");
      System.out.println( htmlEnd);

   }

} // end class