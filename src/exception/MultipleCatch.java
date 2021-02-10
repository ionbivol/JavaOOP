package exception;

public class MultipleCatch {
    public static void main(String[] args) {


        try{
            int a = 4 / 0;
        }catch (ArithmeticException e){
            System.out.println("The most specific exception: " + e);
        }catch (NullPointerException ex){
            System.out.println(ex);
        }catch (NegativeArraySizeException e){
            System.out.println("The NegativeArraySizeException");
        }



    }
}