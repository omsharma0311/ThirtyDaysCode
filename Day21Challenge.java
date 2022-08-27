import java.util.Scanner;
public class Day21Challenge
{
   public static void main(String args[])
   {
       Scanner scInput=new Scanner(System.in);
       int hour;
       int minute; 
       System.out.println("Enter Hour");
       hour=scInput.nextInt();
       System.out.println("Enter Minute");
       minute=scInput.nextInt();
       
       int clockAngle = angle(hour,minute);
       if(clockAngle==0)
       {
         System.out.println("Hour and minute hand overlap");  
       }
       else
       {
           System.out.println("Angle is " +clockAngle);
       }
       
   }
   public static int angle(double h, double m)
   {
       if(h<0 || m<0|| h>12 || m>60)
            System.out.println("Wrong Input");
            
       if(h==12)
            h=0;
       if(m==60)
            m=0;
       
       int hour=(int)(0.5*(h*60+m));
       int minute=(int)(6*m);
       int angle=Math.abs(hour-minute);
       angle=Math.min(360-angle,angle);
       return  angle;
   }
}
