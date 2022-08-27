public class Day5Cahllenge
{
    public static void main(String args[])
    {
        int sec[]={1,2,3,4,5,6,7,8,9};
        int l=sec.length;
        int temp=0;
        for(int i=0;i<l;i++)
        {
            for(int j=1;j<(l-i);j++)
            {
                if(sec[j-1]>sec[j])
                {
                    temp=sec[j-1];
                    sec[j-1]=sec[j];
                    sec[j]=temp;
                }
            }
        }
        System.out.println("Smallest element is "+sec[0]);
    }
}
