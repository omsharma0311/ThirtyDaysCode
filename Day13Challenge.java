import java.util.Scanner;
public class Day13Challenge
{
    public static void main(String[] args)
    {
      Scanner scannerObject=new Scanner(System.in);
      
      System.out.println("Enter Kara Glass Count");
      int karaGlassCount=scannerObject.nextInt();
      int karaGlassRate=5;
      
      System.out.println("Enter Rani Glass Count");
      int raniGlassCount=scannerObject.nextInt();
      int raniGlassRate=7;
      
      int karaMoney=karaGlassCount*karaGlassRate;
      int raniMoney=raniGlassCount*raniGlassRate;
      
      if(karaMoney>raniMoney)
          System.out.println("Kara has more money");
      else if(karaMoney<raniMoney)
          System.out.println("Rani has more money");
       else if(karaMoney==raniMoney)
          System.out.println("Both have equal money");
      
    } 
}
