public class LongestWord {

    public static void main(String[] args)
    {
        String str="Biggest word in the sentence";
        String[] strArr =str.split(" ");

        String longestWord="";
        for (String word: strArr)
        {
            if(word.length()>longestWord.length())
            {
                longestWord=word;
            }
        }
        System.out.println("The longest word is: "+longestWord);
    }

}
