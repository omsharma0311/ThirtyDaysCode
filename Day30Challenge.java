import java.util.Scanner;
public class Day30Challenge
{
   public static void main(String args[])
   {
       Scanner scannerObject=new Scanner(System.in);
       System.out.println("Enter first number");
       int num1=scannerObject.nextInt();
       
       System.out.println("Enter second number");
       int num2=scannerObject.nextInt();
    
       int sum=num1+num2;
       int diff=num1-num2;
       int product=num1*num2;
       int avg=sum/2;
       int maximum=0;
       int minimum=0;
       if (num1>num2)
       {
           maximum=num1;
           minimum=num2;
       }
       else
       {
           maximum=num2;
           minimum=num1;
       }
       
       System.out.println("Sum "+sum);
       System.out.println("Difference "+diff);
       System.out.println("Product "+product);
       System.out.println("Average "+avg);
       System.out.println("Maximum "+maximum);
       System.out.println("Minimum "+minimum);
   }
}
