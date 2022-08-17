package Generics;

import java.util.ArrayList;

/*
* https://stackoverflow.com/questions/4343202/difference-between-super-t-and-extends-t-in-java
*
* Refer upper and lower bound wild card
* */

/*
* If we want the genric behavior to be constrained with some specific datatype then
* we can use "extends" Eg, <T extends List> here in only those type will be permitted
* which will be child of List.
* */
public class CustomList<T> {

    // This is an generic method
    static<Z> Z testMethod(Z value){
        return value;
    }
//..........................................
    ArrayList<T> AL= new ArrayList<>();

    public void add(T element) {
            AL.add(element);
    }


    public void remove(T element) {  //Here parameter type is generics
        AL.remove(element);
    }



    @Override
    public String toString() {
        return AL.toString();
    }

    public T get(int i) {  // Here the return type is also generics
        return AL.get(i);
    }
}
