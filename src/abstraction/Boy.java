package abstraction;

public class Boy extends Human{


    @Override
    public boolean giveBirth() {
        return false;
    }

    @Override
    public int howOldAre() {
        return 18;
    }


}
