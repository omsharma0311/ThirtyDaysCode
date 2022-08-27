import java.util.Scanner;
public class Day23Challenge
{
   public static void main(String args[])
   {
       Scanner scInput=new Scanner(System.in);
       
       String s="";
       System.out.println("Enter Number");
       int input=scInput.nextInt();
       while(input>0)
       {
           int temp=input%2;
           s=temp+s;
           input=input/2;
       }
       System.out.println("Binary is "+s);
   }
}
