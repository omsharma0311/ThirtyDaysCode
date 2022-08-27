public class Day20Challenge
{
    public static int square(int n)
    {
        if (n < 0)
            n = -n;
        int res = n;
        for (int i = 1; i < n; i++)
            res =res+ n; 
        return res;
    }
    public static void main(String[] args)
    {
       System.out.println(square(5));
    }
}
