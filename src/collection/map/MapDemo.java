package collection.map;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap();

        myMap.put("a", 2);
        myMap.put("b", 3);           //Cheile trebuie sa fie unice
        myMap.put("c", 2);           //valorile pot fi dublicate

        System.out.println(myMap);

        Boolean key = myMap.containsKey("a");
        System.out.println(key);
        if (!myMap.containsKey("d")) {
            myMap.put("d", 4);
        }
        System.out.println(myMap);
        myMap.remove("c");                      //stergem key
        System.out.println(myMap);


        System.out.println(myMap.get("d"));         //a citi valoarea din key "D"

        System.out.println(myMap.size());           //dimensiunea mapei

        myMap.getOrDefault("d", 0);        //daca nu exista ii da valoarea 0
        myMap.getOrDefault("e", 0);     // da valoarea default

        System.out.println("The value of the key e:" + myMap.getOrDefault("e", 0));


        //iterator prin key
        Iterator<String> iterator = myMap.keySet().iterator();
        while (iterator.hasNext()) {
            String mapKey = iterator.next();
            System.out.println("The key: " + myMap + " for value " + myMap.get(mapKey));

            for(Map.Entry entry : myMap.entrySet()){
                System.out.println("\n" + entry.getKey() + " " + entry.getValue());
            }


            SortedMap<Integer, Integer> map = new TreeMap<>();  //operatorul de sortare

            map.put(7,8);
            map.put(3,5);
            map.put(2,4);

            System.out.println("\n" + map);  //le sorteaza automat de la mic la mare




        }


    }

}
