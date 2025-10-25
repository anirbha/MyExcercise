public class LongestEvenLengthWord {

    public static void main(String[] args) {
        String input = "I am looking for the longest even length word";
        String result = findLongestEvenLengthWord(input);
        System.out.println("The longest even length word is: " + result);
    }

    private static String findLongestEvenLengthWord(String input) {
        String[] inputArr=input.split(" ");
        int len=inputArr.length;
        for(int i=0;i<len;i++){
            if(inputArr[i].length()%2!=0){
                inputArr[i]="";
            }
        }

        for(int i=0; i<len; i++){
            for (int j=i+1; j<len; j++)
            {
                if(inputArr[i].length()<inputArr[j].length())
                {
                    String temp=inputArr[i];
                    inputArr[i]=inputArr[j];
                    inputArr[j]=temp;
                }
            }
        }
      return inputArr[0];
    }
}
