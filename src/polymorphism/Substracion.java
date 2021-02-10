package polymorphism;

public class Substracion {
    String substract(String firstName, String adress, String lastName ){
    return firstName+lastName+adress;
    }
    String substract(String lastName, String firstName){
        return lastName+firstName;
    }
    String substract(String adress){
        return adress;
    }
}
