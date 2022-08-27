import java.util.*;
public class Day14Challenge
{
    public static void main(String[] args)
    {
       String studentArr[]={"Ram","Anuj","Deepak","Ravi"};
       combination(studentArr,0);
    }
    public static void combination(String[] studentArr,int start)
    {
        for(int i=start;i<studentArr.length;i++)
        {
            String temp=studentArr[start];
            studentArr[start]=studentArr[i];
            studentArr[i]=temp;
            combination(studentArr,start+1);
            studentArr[i]=studentArr[start];
            studentArr[start]=temp;
        }
        if(start==studentArr.length-1)
        {
          System.out.println(Arrays.toString(studentArr));  
        }
    }
}
