import java.util.Scanner;
public class Day22Challenge
{
   public static void main(String args[])
   {
       Scanner scannerObject=new Scanner(System.in);
       System.out.println("Enter any year");
       int year=scannerObject.nextInt();
       
    
       if(year % 400 == 0)
           System.out.println("Leap year");
       else if(year % 100 == 0)
           System.out.println("Not Leap year");
       else if(year % 4 == 0)
           System.out.println("Leap year"); 
       else 
           System.out.println("Not Leap year");
   }
}
