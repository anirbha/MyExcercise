package Maps;

import java.util.HashMap;

public class CopyMap {

    public static void main(String[] args)
    {
        HashMap<String,Integer> hashmap1=new HashMap<>();
        HashMap<String,Integer> hashmap2=new HashMap<>();

        hashmap1.put("apple",1);
        hashmap1.put("mango",10);
        hashmap1.put("orange",4);
        System.out.println("hashmap1 " + hashmap1);
        hashmap2.put("potato",2);
        hashmap2.put("onion",3);
        System.out.println("hashmap2 "+hashmap2);
        hashmap2.putAll(hashmap1);
        System.out.println("hashmap2 after copy "+ hashmap2);

    }
}
