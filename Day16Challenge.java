import java.util.Scanner;
public class Day16Challenge
{
    public static void main(String[] args)
    {
      Scanner scannerObject=new Scanner(System.in);
      
      int n=scannerObject.nextInt();
      int sum=getsum(n);
      
      System.out.println("Sum of Digits of "+n+" is "+sum);      
    } 
    public static int getsum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    } 
}
