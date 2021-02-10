package polymorphism;

public class Main {
    public static void main(String[] args) {

        Substracion substracion = new Substracion();


        System.out.println(substracion.substract("Stefan cel Mare"));
        System.out.println(substracion.substract("Stefan cel Mare"," Bivol"," Ion"));
        System.out.println(substracion.substract("Ion"," Bivol"));


        Multiplication multiplication = new Multiplication();

       int multiply = multiplication.multiply(4,75);

        System.out.println("The result is: "+ multiply);


    }
}
