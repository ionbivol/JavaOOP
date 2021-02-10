package abstraction;

abstract class Human {


    private final int numberOfLegs = 2;

    protected void walk(){
        System.out.println("Walk on " + numberOfLegs+ " legs");
    }

    public abstract boolean  giveBirth();  //here whe have 2 abstract methods
    public  abstract int howOldAre();       // which  will be implemented in child class


}
