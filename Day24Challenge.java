import java.util.HashMap;
import java.util.Scanner;
public class Day24Challenge
{
   private static int[] bases={1000,900,500,400,100,90,50,40,10,9,5,4,1};
   private static HashMap<Integer,String> map=new HashMap<Integer,String>();
   public static void setup()
   {
       map.put(1,"I");
       map.put(4,"IV ");
       map.put(5,"V");
       map.put(9,"IX");
       map.put(10,"X");
       map.put(40,"XL");
       map.put(50,"L");
       map.put(90,"XC");
       map.put(100,"C");
       map.put(400,"CD");
       map.put(500,"D");
       map.put(900,"CM");
       map.put(1000,"M");
   }
   public static String intToRoman(int num)
   {
       setup();
       String result=new String();
       for(int i:bases)
       {
           while(num>=i)
           {
               result=result+map.get(i);
               num=num-i;
           }
       }
       return result;
   }
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Julis Count");
       int jCount=sc.nextInt();
       System.out.println("Enter Nancy Count");
       int nCount=sc.nextInt();
       int sum=jCount+nCount;
       String result=intToRoman(sum);
       System.out.println(sum+ " -> " +result);
   }
}
