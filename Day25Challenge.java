import java.util.Scanner;
public class Day25Challenge
{
   public static final int PASSWORD_LENGTH = 8;
   public static void main(String args[])
   {
       System.out.println("Enter Password");
       Scanner scInput=new Scanner(System.in);
       String input=scInput.nextLine();
       if(Valid(input))
       {
           System.out.println("Valid Password: "+input);
       }
       else
       {
           System.out.println("Not a valid Password: "+input);
       }
   }
   public static boolean Valid(String input)
   {
       int charCount=0;
       int numCount=0;
       
       if(input.length() < PASSWORD_LENGTH)
        return false;
        
       for(int i=0;i< input.length();i++)
       {
           char ch=input.charAt(i);
           if(numeric(ch))
                numCount++;
           else if(character(ch))
                charCount++;
           else
                return false;
       }
       return (charCount>=2 && numCount>=2);
   }
   public static boolean numeric(char ch)
   {
       return (ch>='0' && ch <='9');
   }
   public static boolean character(char ch)
   {
       ch=Character.toUpperCase(ch);
       return (ch>='A' && ch <='Z');
   }
}
