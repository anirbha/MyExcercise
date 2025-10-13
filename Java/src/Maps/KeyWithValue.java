package Maps;

import java.util.HashMap;
import java.util.Map;

public class KeyWithValue {

    public static void main(String[] args)
    {
        HashMap<String,Integer> map= new HashMap<>();

        map.put("apple",1);
        map.put("mango",3);
        map.put("banana",2);
        map.put("pineapple",3);

        for(Map.Entry x: map.entrySet())
        {
            System.out.println(x.getKey() + " key "+ x.getValue());
        }
    }
}
