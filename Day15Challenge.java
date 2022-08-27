public class Day15Challenge
{
    public static void main(String[] args)
    {
      float dvdCost=42.0f;
      float earningPercent=12.0f;
      float earning=(dvdCost*100.0f)/earningPercent;
      float saving=earning-dvdCost;
      System.out.println("Saving "+saving);
      
    } 
}
