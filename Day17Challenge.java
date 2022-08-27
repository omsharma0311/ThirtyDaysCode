import java.util.HashMap;
import java.util.Set;
public class Day17Challenge
{
   public static void main(String args[])
   {
        String person="ABC BCD CDE ABC CDE EFG BCD FGH ABC GHI";
        duplicate(person);
   }
   public static void duplicate(String value)
   {
       String item[]=value.split(" ");
       HashMap<String, Integer> map=new HashMap<String, Integer>();
       for(String t:item)
       {
           if(map.containsKey(t))
           {
              map.put(t,map.get(t)+1); 
           }
           else
           {
              map.put(t,1);  
           }
       }
       Set<String> keys=map.keySet();
       for(String key:keys)
       {
           if(map.get(key)>1)
           {
               System.out.print(key+ " ");
           }
       }
   }
}
