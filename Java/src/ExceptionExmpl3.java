public class ExceptionExmpl3 {

    public static void main(String args[])
    {
        try{
            int data=100/0;
        }
        catch(Exception e) {
            throw new RuntimeException("Failed operation", e);
        }
        finally
        {
            System.out.println("Finally block is always executed");
        }

    }

}
