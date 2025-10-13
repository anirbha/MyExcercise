package Maps;

import java.util.HashMap;
import java.util.Map;

public class MaxAndMinChars {

    public static void main (String[] args)
    {

        String str="Anirban";

        Map<Character,Integer> countmap=new HashMap<>();

        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);

            if (countmap.containsKey(ch))
            {
                countmap.put(ch,countmap.get(ch)+1);
            }
            else
            {
                countmap.put(ch,1);
            }
        }

//        int maxValue = Collections.max(countmap.values());

        int max=Integer.MIN_VALUE;
        char maxKey='\u0000';
        for(Map.Entry<Character,Integer> entry: countmap.entrySet())
        {
            if(entry.getValue()>max)
            {
                max=entry.getValue();
                maxKey=entry.getKey();
            }
        }
        System.out.println("value is " + max + " and char is "+maxKey);


    }
}
