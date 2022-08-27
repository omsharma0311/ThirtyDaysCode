import java.util.Scanner;
public class Day11Challenge
{
    public static void main(String[] args)
    {
       int durationOfFirstMovieInMinute=100;
       int durationOfSecondMovieInMinute=110;
       int totalDurationInMinute=durationOfFirstMovieInMinute+durationOfSecondMovieInMinute;
       float hour=(float)totalDurationInMinute/60;
       //int min=totalDurationInMinute%60;
       System.out.println("Time taken by Dan to watch Movie is "+hour);
    } 
}
