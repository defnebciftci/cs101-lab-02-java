import java.util.Scanner;

public class Lab02c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      //constants
      
      int max, min;
      
      
      //variables
      
      int firstNum;
      int secNum;
      
      //program
      
      System.out.println("Your first number is: ");
      firstNum = scan.nextInt();
      
      System.out.println("Your second number is: ");
      secNum = scan.nextInt();
      
      max = Math.max(firstNum, secNum);
      min = Math.min(firstNum, secNum);
      
      System.out.println("Sum of first and second number is " + (firstNum+secNum));
      System.out.println("Their difference is " + (firstNum-secNum));
      System.out.println("Their product is " + (firstNum*secNum));
      System.out.println("The result of dividing the first number from the second number is " + (firstNum/secNum));
      System.out.println("The remainder of the division is " + (firstNum%secNum));
      System.out.println("The maximum number between the two is " + max);
      System.out.println("The minimum number between the two is " + min);
      
   }
}