import java.util.Scanner;
public class Day7Challenge
{
    public static void main(String[] args)
    {
        int totalDays=1200000;
        int days=365;
        int yearlyTravel=Multiply(totalDays,days);
        System.out.println(yearlyTravel);
    }
    public static int Multiply(int x,int y)
    {
        if(y==0)
            return 0;
            
        if(y>0)
         return (x+Multiply(x,y-1));
         
        if(y<0)
         return -Multiply(x,-y);
         
        return -1;
    }
   
}
