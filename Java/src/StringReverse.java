public class StringReverse {

    public static void main(String[] args)
    {
        String str="Welcome";
        StringReverse obj =new StringReverse();
        String output=obj.stringReverse(str);
        System.out.println(output);
    }

    public String stringReverse(String input)
    {
        StringBuilder output =new StringBuilder();
        char[] chars=input.toCharArray();

        for(int i=chars.length-1 ; i>=0;i--)

        {
            output.append(chars[i]);
        }
        return output.toString();
    }
}
