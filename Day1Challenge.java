import java.util.Scanner;
public class Day1Challenge
{
    public static void main(String[] args)
    {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("Enter number");
    
        int number=scannerObject.nextInt();
        System.out.println("Input number is "+number);
    
        for(int i =1;i<11;i++)
        System.out.println(number +"*" +i+ "=" +i*number);
    }
}
