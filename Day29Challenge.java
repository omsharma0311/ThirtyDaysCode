import java.util.Scanner;
public class Day29Challenge
{
   public static void main(String args[])
   {
       Scanner scannerObject=new Scanner(System.in);
       System.out.println("Enter distance in meters");
       float num1=scannerObject.nextFloat();       
       System.out.println("Enter time hours");
       float num2=scannerObject.nextFloat();       
       System.out.println("Enter time Min");
       float num3=scannerObject.nextFloat();
       System.out.println("Enter time Second");
       float num4=scannerObject.nextFloat();
    
       float time=(num2*3600)+(num3*60)+num4;
       float kmph=(num1/1000.0f)/(time/3600.0f);
       float mph=kmph/1.609f;
       
       System.out.println("Speed in miles per hour "+mph);
   }
}
