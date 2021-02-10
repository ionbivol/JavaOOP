package abstraction;

public class Main {
    public static void main(String[] args) {

        Human man = new Male();
        Human female = new Female();
        Human boy = new Boy();
        Human girl = new Girl();


        man.walk();        //toti extind aceasta metoda pentru ca este implemenata
        female.walk();      // de clase prin cuvintul "extends"
        boy.walk();         // adica toate sublasele o implementeaza

        System.out.println("");
        System.out.println("Did male give birth? The answer is " +man.giveBirth());
        System.out.println("The ace of the man is " + man.howOldAre());



    }
}
