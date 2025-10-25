
public class HideCreditCard {

    public static void main(String args[]){
//        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        String creditcard = "1234567890123456";
        String hiddenCardno=hiddenCalculation(creditcard);
        System.out.println(hiddenCardno);

    }

    public static String hiddenCalculation(String cardno)
    {
        String hidden="";
        int len=cardno.length();
        if (len != 16)
        {
            return ("the card is invalid");
        }
        else {

            for (int i=0; i< len ;i++)
            {
                if(i%4==0 && i!=0)
                {
                    hidden=hidden+"-";
                }
                if(i<12)
                {
                    hidden=hidden+"X";
                }
                else {
                    hidden=hidden+cardno.charAt(i);
                }
            }

            return hidden;
        }
    }
}
