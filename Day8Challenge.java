import java.util.Scanner;
public class Day8Challenge
{
    public static void main(String[] args)
    {
       int nurse1=8;
       int nurse2=10;
       int nurse3=9;
       int nurse4=8;
       int nurse5=7;
       int nurse6=12;
       int nurseCount=6;
       float avgHours=avgHours(nurse1,nurse2,nurse3,nurse4,nurse5,nurse6,nurseCount);
       System.out.printf("Average Hours is : %f", avgHours);
    }
    public static float avgHours(int a,int b,int c, int d,int e,int f, int nCount)
    {
        float totalHours=(float)a+b+c+d+e+f;
        float temp=(float)totalHours + nCount;
        float avgHour=totalHours/nCount;
        return avgHour;
    }
   
}
