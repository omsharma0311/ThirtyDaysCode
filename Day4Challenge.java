import java.util.Scanner;
public class Day4Challenge
{
    public static void main(String[] args)
    {
        Scanner scannerObject=new Scanner(System.in);
        
        System.out.println("Enter first number");    
        int firstNumber=scannerObject.nextInt();
        
        System.out.println("Enter second number");    
        int secondNumber=scannerObject.nextInt();
        
        int temp=secondNumber;int counter=0;
        
        for(int i=firstNumber;i>0;)
        {
            i=i-secondNumber;
            if(i>0)
                counter++;
        }   
        System.out.println("Counter "+counter); 
        
    
    }
}
