import java.util.ArrayList;
import java.util.*;
//.................................Iterator to print object...................................................
public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        Iterator i=a.iterator();
        System.out.println(a);
        //....................remove the element using iterator ..................
        while (i.hasNext()) {
            if(i.next().equals(20)){
               i.remove();
       }}
            System.out.println(a);

    }}
