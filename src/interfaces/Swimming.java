package interfaces;

public interface Swimming {

    void swim();

    default void massage(){
        System.out.println("Default method inside Swiming interface!");
    }

    static void message2(){
        System.out.println("Static method inside Swiming interface!");

    }

}
