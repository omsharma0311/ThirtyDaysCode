import java.util.Scanner;
public class Day6Challenge
{
    public static void main(String[] args)
    {
        Scanner scannerObject=new Scanner(System.in);
        
        System.out.println("Enter free byte"); 
        byte f=scannerObject.nextByte();
        
        System.out.println("Enter byte used");
        byte u=scannerObject.nextByte();
        
        byte TotalSize=(byte)(f+u);
        byte TotalFree=(byte)(TotalSize-u);
        System.out.println("Total size now "+TotalSize);
        System.out.println("Total free size now "+TotalFree);
        
        System.out.println("Enter byte size of deleted file");
        byte o=scannerObject.nextByte();
        TotalFree=(byte)(TotalFree+o);
        System.out.println("Total free size now "+TotalFree);
        
        System.out.println("Enter byte size of new file");
        byte n=scannerObject.nextByte();
        TotalFree=(byte)(TotalFree-n);
        System.out.println("Total free size now "+TotalFree);
    }
}
