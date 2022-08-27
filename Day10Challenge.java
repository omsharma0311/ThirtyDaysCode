import java.util.Scanner;
public class Day10Challenge
{
    public static void main(String[] args)
    {
      int totalMiles=2052;
      int days=6;
      int townToStop=2;
      double kmPerMile=1.60;
      int avgMiles=(totalMiles/days)/townToStop;
      double avgKM=avgMiles*kmPerMile;
       System.out.println("Average KM Per Day "+ avgKM);
    } 
}
