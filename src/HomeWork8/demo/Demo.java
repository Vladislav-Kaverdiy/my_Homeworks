package HomeWork8.demo;
import HomeWork8.count.Count;
import HomeWork8.impl.ImplSmartable;
import HomeWork8.interfacee.Smartable;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Count count = new Count();
        count.parseString("Generally, any device that can perform numerical calculations, " +
                "even an adding machine, may be called a computer but nowadays this term is used especially for digital computers. " +
                "Computers that once weighed 30 tons now may weigh as little as 1.8 kilograms. " +
                "Microchips and microprocessors have considerably reduced the cost of the electronic components required in a computer. " +
                "Computers come in many sizes and shapes such as special-purpose, laptop, desktop, minicomputers, supercomputers.");


        Smartable smartable = new ImplSmartable();
        Map<String, String> map = new HashMap<>();
        map.put("Вася", "Иванов");
        map.put("Петр", "Петров");
        map.put("Виктор", "Сидоров");
        map.put("Сергей", "Савельев");
        map.put("Вадим", "Викторов");
        System.out.println(smartable.isUnique(map) );


        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Janet", 87);
        map1.put("Logan", 62);
        map1.put("Whitaker", null);
        map1.put("Alyssa", 100);
        map1.put("Stefanie", 80);
        map1.put("Jeff", 88);
        map1.put("Kim", 52);
        map1.put("Sylvia", 95);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Logan", 62);
        map2.put("Kim", 52);
        map2.put("Whitaker", 52);
        map2.put("Jeff", 88);
        map2.put("Stefanie", 80);
        map2.put("Brian", 60);
        map2.put("Lisa", 83);
        map2.put("Sylvia", 87);
        System.out.println (smartable.intersect(map1, map2));


        Set<String> list = new HashSet<>();
        list.add("foo");
        list.add("buzz");
        list.add("bar");
        list.add("fork");
        list.add("bort");
        list.add("spoon");
        list.add("dude");
        System.out.println(smartable.removeEvenLength(list));

    }
}