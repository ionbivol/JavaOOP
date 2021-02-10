package collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {


        Set<String> mySet = new HashSet<>();

        mySet.add("Monday");
        mySet.add("Tuesday");
        mySet.add("Wednesday");
        mySet.add("Thursday");
        mySet.add("Friday");
        mySet.add("Friday");

        mySet.add(null);

        System.out.println(mySet +"\n");


        mySet.size();
        mySet.contains("Friday");


        for(String str : mySet){
            System.out.println(str);
        }


    }
}
