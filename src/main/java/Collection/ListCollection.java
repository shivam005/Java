package Collection;
/*
* .size()
* .isEmpty()
* .get(index:1)
* .contains("element to be checked")
* .indexOf("element for which index to be checked")
* List.of("name" ,"of", "all", "the elements") //whatever we create using this .of keyword, it becomes
* immutable.
*
* In case of enhanced for loop, we are not allowed to make modification,
* especially performing delete operations as it may affect the size of the list.
* Hence, in such situation we are supposed to use iterator instead of enhanced for loop.
* As it has been seen that while deleting multiple elements only one element gets deleted,
* which is not desirable.
*
* */

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ListCollection  {

    public static void main(String[] args) {
        List<Student> AL = new ArrayList<>();
        AL.add(new Student(1011, "baba"));
        AL.add(new Student(1021, "baba1"));
        Collections.sort(AL);
        System.out.println(AL);
//        List<Integer> i=List.of(2,2,3,4,5,1);
//        ArrayList<Integer> j= new ArrayList<>(i);
//         Collections.sort(j);
//        System.out.println(j);


//It has to be reviewed
//        System.out.println(AL.sort(new Comparator<Student>(){
//            @Override
//            public int compare(Student o1, Student  o2) {
//                return Integer.compare(o1.getRollNo(), o2.getRollNo());
//            }
//            return this;
//        }));
// It has to be reviewed




    }



}
