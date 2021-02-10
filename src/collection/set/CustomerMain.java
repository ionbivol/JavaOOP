package collection.set;

import java.util.HashSet;
import java.util.Set;

public class CustomerMain {
    public static void main(String[] args) {

        Set<Customer> customers = new HashSet<>();

        customers.add(new Customer(1,"Ion", 24));
        customers.add(new Customer(2,"Florin", 2));
        customers.add(new Customer(1,"Vasile", 26));
        customers.add(new Customer(2,"Vasile", 26));

        System.out.println(customers.toString());
    }
}
