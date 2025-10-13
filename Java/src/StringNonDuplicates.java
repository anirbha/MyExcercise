import java.util.LinkedHashMap;
import java.util.Map;

public class StringNonDuplicates {

    public static void main (String[] args)
    {
        String str= "analogy";

        LinkedHashMap<Character,Integer> countMap= new LinkedHashMap<>();

        for(int i=0; i<str.length();i++)
        {
           Character c=str.charAt(i);

           if(countMap.containsKey(c))
           {
               countMap.put(c,countMap.get(c)+1);
           }
           else
           {
               countMap.put(c,1);
           }
        }
        for(Map.Entry<Character,Integer> e: countMap.entrySet())
        {
            if(e.getValue()==1)
            {
                System.out.println("first non repeated char "+e.getKey());
            }
        }
    }
}
