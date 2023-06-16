import java.util.*;
public class HashMap_collection {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("monisha",63);
        System.out.println(map);
        map.remove("monisha");
        System.out.println(map);
        map.put("aaa",78);
        System.out.println(map);
      int n=  map.get("aaa");
        System.out.println(n);
        if(map.containsKey("aaa")){
            map.put("moni",61);}
        map.clear();
        System.out.println(map);



   //     .....................................Hahset...........................
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        System.out.println("Is set empty? " + set.isEmpty());




    }
}
