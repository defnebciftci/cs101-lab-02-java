import java.util.Scanner;

/**
 * __Lab02d___ 
 * @author __Nur Çiftci___
 * @version __18.10.2018__
 */ 
public class Lab02d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final int FlowerPerSquareMeter = 17;

      // variables
      int edge1;
      int edge2;
      int edge3;
      double s;
      double area;
      int totalFlower;

      // program code
      System.out.println( "Enter the first edge for the triangle in meters: " );
      edge1 = scan.nextInt();
      
      System.out.println( "Enter the second edge for the triangle in meters: ");
      edge2 = scan.nextInt();
      
      System.out.println( "Enter the third edge for the triangle in meters: " );
      edge3 = scan.nextInt();
      
      s = (edge1 + edge2 + edge3)/2;
      
      area = Math.sqrt( s * (s - edge1) * (s - edge2) * (s - edge3));
      totalFlower = (int)(area * FlowerPerSquareMeter);
      
      System.out.println("The total number of flowers that can be planted in this garden is " + totalFlower);
      
      

   }

} // end class
