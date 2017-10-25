package HomeWork8.impl;



import HomeWork8.interfacee.Smartable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ImplSmartable implements Smartable {
    @Override
    public boolean isUnique(Map<String, String> map) {
        return map.values().size() == map.values().stream().distinct().count();
    }

    @Override
    public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                boolean should = map1.get(key) == null ? map2.get(key) == null
                        : map1.get(key).equals(map2.get(key));
                if (should) {
                    result.put(key, map1.get(key));
                }
            }
        }
        return result;
    }

    @Override
    public Set<String> removeEvenLength(Set<String> set) {
        Set<String> list = new HashSet<>();
        for (String value : set) {
            if (value.length() % 2 != 0) {
                list.add(value);
            }
        }
        return list;
    }
}