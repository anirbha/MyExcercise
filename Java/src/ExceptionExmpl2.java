public class ExceptionExmpl2 {

    public static void main(String args[])
    {
        int a=10;
        int b=0;
        int c;
        try
        {
            c=a/b;
            System.out.println("The result is "+c);
        }

        catch(ArithmeticException e)
        {
            System.out.println("You cannot divide a number by zero");
        }

        catch (ArrayIndexOutOfBoundsException e)
        {

        }
        System.out.println("The program continues after the exception");
    }
}
