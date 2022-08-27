import java.util.Scanner;
public class Day26Challenge
{
   public static void main(String args[])
   {
       Scanner scannerObject=new Scanner(System.in);
       System.out.println("Enter temp in celsius");
       float c=scannerObject.nextFloat();
       float f=c*(9/5)+32;
       
       System.out.println("Temp in fahrenheit "+f);
   }
}
