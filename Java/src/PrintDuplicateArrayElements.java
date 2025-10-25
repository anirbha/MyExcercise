import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateArrayElements {

    public static void main(String args[])
    {
        int[] arr= { 1,4,4,6,7,9,6,6,2,5};

        Set<Integer> set= new HashSet<>();
        Set<Integer> duplicateSet= new HashSet<>();

        for(int i=0; i<arr.length; i++)
        {
            if(!set.add(arr[i])) // return false for duplicate elements
            {
                duplicateSet.add(arr[i]);
            }
        }
        for(Integer i: duplicateSet)
        {
            System.out.println("duplicate numbers"+ i);
        }
    }






}
