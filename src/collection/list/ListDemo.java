package collection.list;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        List <String>shoppingList = new ArrayList<>();

        shoppingList.add("Bread");
        shoppingList.add("Milk");
        shoppingList.add("Onion");

        System.out.println(shoppingList.get(0));
        System.out.println(shoppingList.get(1));
        System.out.println(shoppingList.get(2));

        shoppingList.add(3,"Tomato");
        System.out.println(shoppingList.get(3));

        shoppingList.add(1,"Cheese");
        System.out.println(shoppingList.get(1));

        System.out.println(shoppingList);


       shoppingList.remove(0);
        System.out.println(shoppingList);


       boolean value = shoppingList.contains("Milk");
        System.out.println(value);

        System.out.println(shoppingList.size());


        System.out.println("");
        for(String item : shoppingList){
            System.out.println("Usign for-each" + item);
        }


        Iterator<String> itr = shoppingList.iterator();

        while(itr.hasNext()){
            String element = itr.next();
            System.out.println("Using an iterator" + element);
        }





    }
}