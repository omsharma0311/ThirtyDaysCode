import java.util.Scanner;
public class Day27Challenge
{
   public static void main(String args[])
   {
       Scanner scannerObject=new Scanner(System.in);
       System.out.println("Enter distance in centimeters");
       double num1=scannerObject.nextDouble();       
       
       System.out.println("In CM"+num1*0.394);
       System.out.println("In M "+num1*0.01);
       System.out.println("In KM "+num1*00001);
   }
}
