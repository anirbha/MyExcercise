import java.util.HashMap;
import java.util.Map;

public class StringFindDuplicates {

    public static void main (String[] args)
    {
        String str="Accessories";

        Map<Character,Integer> countMap= new HashMap<>();

        for(int i=0; i<str.length(); i++ )
        {
            char c=str.charAt(i);

            if(countMap.containsKey(c))
            {
                countMap.put(c,countMap.get(c)+1);
            }
            else
            {
                countMap.put(c,1);
            }
        }

        for(Character c: countMap.keySet())
        {
           if(countMap.get(c)>1)
           {
               System.out.println("Duplicate characters are " + c + " and it is repeated "+ countMap.get(c) +" times");
           }
        }
    }
}
