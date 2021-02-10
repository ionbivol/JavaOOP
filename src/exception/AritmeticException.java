package exception;

public class AritmeticException {
    public static void main(String[] args) {

        //        int a =4/0;     AritmeticException
        try {
            int a = 4 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("This will be printed no matther what");
        }


        int[] array = new int[5];
        try {

            System.out.println(array[6]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        }

    }
}
