package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(new Integer(0));
        list.add(new Integer(1));

        Integer vall = (Integer)list.iterator().next();
        Integer vall2 = (Integer) list.iterator().next();

        List<Integer> myList = new ArrayList<>();       //Face cast direct

        list.add(new Integer(0));
        list.add(new Integer(1));

        Integer val = myList.iterator().next();



    }
}
