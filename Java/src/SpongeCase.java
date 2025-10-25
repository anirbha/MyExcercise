public class SpongeCase {

    public static void main(String args[])
    {
        String input= "java programming";
        SpongeCase(input);
    }
    public static void SpongeCase(String str)
    {
        int len=str.length();
        String temp="";
        char ch;
        for(int i=0; i<len ; i++)
        {
            ch=str.charAt(i);
            if(i%2!=0)
            {
                temp=temp+Character.toUpperCase(ch);
            }
            else
            {
                temp=temp+ch;
            }
        }
        System.out.println(temp);
    }
}
