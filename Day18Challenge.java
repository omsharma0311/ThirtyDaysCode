import java.util.*;
public class Day18Challenge
{
    public static void main(String[] args)
    {
        int fishArray[]={10,11,12,13,14};
        int largestFish= fish(fishArray);
        System.out.println("Size of largest fish is "+largestFish);
    }
    public static int fish(int arr[])
    {
        Arrays.sort(arr);
        int length=arr.length;
        int large=arr[(length-1)];
        return large;
    }
}
