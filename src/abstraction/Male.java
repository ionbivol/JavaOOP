package abstraction;

public class Male extends Human {


    @Override
    public boolean giveBirth() {
        return false;
    }

    @Override
    public  int howOldAre() {
        return 14;
    }

    public int ageOfMale = 30;


}