import java.util.*;
public class Arraylist_collection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        System.out.println(list);
        list.remove("java");
        list.add("monisha");
        System.out.println(list);
        for (String element : list) {
            System.out.println(element);

        }
        list.clear();
        System.out.println(list);
    }}
