public class ExceptionExmpl1 {
    public static void main(String args[]) {
        // Main try block
        try {
            // try-block2
            try {
                // try-block3
                try {
                    int arr[] = { 1, 2, 3, 4 };
                    System.out.println(arr[10]);
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception");
                    System.out.println(" try-block1");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException exception");
                System.out.println(" try-block2");
            }
        } catch (ArrayIndexOutOfBoundsException e4) {
            System.out.print("ArrayIndexOutOfBoundsException");
            System.out.println(" main try-block");
        } catch (Exception e5) {
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }
}
