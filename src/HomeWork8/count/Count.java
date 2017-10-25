package HomeWork8.count;

import java.util.HashMap;
import java.util.Map;


public class Count {
    public static void parseString(String s){
        Map<String, Integer> values = new HashMap<String, Integer>();
        for (int i = 0; i < s.length(); i++){
            String t = (s.substring(i, i+1));
            values.computeIfPresent(t, (k,v) -> v+1);
            values.putIfAbsent(t, 1);
        }

        for(Map.Entry<String, Integer> entry : values.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Letter " + key + " appears " + value + " times.");
        }
    }



}