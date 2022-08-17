package Collection;

import java.util.*;

public class SetCollection {


    public static void main(String[] args) {
        Set<Character> tset;
        tset = new TreeSet<>();

        List<Character> arr=  List.of('a','s','d','s','s','w','e','f','s','q','x','z');

        for(Character ch: arr){
            tset.add(ch);
        }

        System.out.println(tset);

//        Iterator<Character> it= hs.iterator();
//        while(it.hasNext()){
//            System.out.print(it.next());
//        }
    }
}
