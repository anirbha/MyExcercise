import java.util.Scanner;

public class PronicNumber {

    public static void main (String args[])
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the the number");

        int number= scanner.nextInt();

        boolean flag=PronicNum(number);

        if(flag)
        {
            System.out.println("the number is pronic");
        }
        else {
            System.out.println("the number is not pronic");
        }
    }

    public static boolean PronicNum(int num)
    {
        boolean flag=false;
        for(int i =1 ; i<num/2 ; i++)
        {
            if (i*(i+1)==num)
            {
                flag=true;


            }

        }

        return flag;
    }
}
