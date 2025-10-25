package Maps;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWords {

    public static void main (String[] args) {
        String str = "Welcome world welcome java hello java java";
        Map<String, Integer> countmap = new HashMap<>();

        String[] strArr = str.toLowerCase().split(" ");

        for (int i = 0; i < strArr.length; i++) {
            if (countmap.containsKey(strArr[i])) {
                countmap.put(strArr[i], countmap.get(strArr[i]) + 1);
            } else {
                countmap.put(strArr[i], 1);
            }
        }

        int maxNo = Integer.MIN_VALUE;
        String maxKey=null;
        for (Map.Entry<String, Integer> entry : countmap.entrySet()) {
            if(entry.getValue()>maxNo)
            {
                maxNo= entry.getValue();
                maxKey=entry.getKey();
            }
        }

        System.out.println("The maximum repeated word is "+maxKey+" and is repeated for "+ maxNo);

    }
}
