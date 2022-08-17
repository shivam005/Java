package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Streams primarily work with collections of objects and not primitive types.
* https://www.baeldung.com/java-8-primitive-streams*/

public class JavaStream {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
            list.add(10);
            list.add(9);
            list.add(2);
            list.add(3);
        System.out.println(list.stream().filter(x -> x%2==0).collect(Collectors.toList()));
        int sum = list.stream().filter(x->x%2!=0).reduce(0,(x,y)->x+y);
    /*    reduce(T identity, BinaryOperator<T> accumulator);
        Where, identity is initial value
        of type T and accumulator is a
        function for combining two values.*/
        /*
        * Terminal operations which are performed in the end (Consuming) and
        * there are Intermediate operations which are performed in between.
        * */
        System.out.println("Odd Sum "+sum);

        List<String> list1 = new ArrayList<>();
        list1.add("cat");
        list1.add("bat");
        list1.add("rat");
        list1.add("chat");
        list1.add("dog");
        list1.add("anim");
        list1.stream().filter(x->x.endsWith("at")).forEach(System.out::println);
        //Here the method reference implies ClassName::MethodName

        /*
        * "map" means converting a series of inputs to an equal length series of outputs
        * while "reduce" means converting a series of inputs into a smaller number of outputs.*/

        int[] arr= new int[]{2,3,4,3,2,4,5,6,7,8};
        System.out.println(Arrays.stream(arr).sorted().boxed().collect(Collectors.toList()));
        System.out.println(Arrays.stream(arr).distinct().boxed().collect(Collectors.toList()));
       Arrays.stream(arr).distinct().map(x->x*x).forEach(System.out::println);
        System.out.println(Arrays.toString(arr));

    }
}
