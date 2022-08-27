import java.util.Scanner;
public class Day9Challenge
{
    public static void main(String[] args)
    {
       int sweaterPrice=68;
       int swaeterCount=3;
       int computerGamePrice=75;
       int computerGameCount=1;
       int braceletPrice=43;
       int braceletCount=2;
       int returnBraceletCount=1;
       int rebate=10;
       int totalPrice=(sweaterPrice*swaeterCount)+(computerGamePrice*computerGameCount)+(braceletPrice*braceletCount);
       int discount=(braceletPrice*returnBraceletCount)+rebate;
       int finalPrice=totalPrice-discount;
       System.out.println("Final Price "+finalPrice);
    } 
}
