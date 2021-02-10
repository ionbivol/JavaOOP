package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {

    public static void findDuplicateChar(String str){

        char[] chars = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for(Character ch : chars){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch) +1);
            }else {
                map.put(ch,1);
            }
        }

        Set<Character> keys = map.keySet();
        for(Character ch : keys){
            if(map.get(ch) > 1){
                System.out.println("Key: " + ch +" Value " + map.get(ch));
            }
        }

    }

    public static void main(String[] args) {

        String str = "mama";

        findDuplicateChar(str);


    }
}
