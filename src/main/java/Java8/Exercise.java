package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise {

    public static void main(String[] args) {

        //print square of first 10 numbers
      List<Integer> list1=  IntStream.range(1,11).map(e->e*e).boxed().collect(Collectors.toList());
        System.out.println("square "+list1);
        //Map list to lower case
        List<String> list=List.of("caAT","BAT", "Rat");
        System.out.println(list.stream().map(e->e.toLowerCase()).collect(Collectors.toList()));
        System.out.println(list.stream().map(e->e.length()).collect(Collectors.toList()));
        System.out.println(IntStream.range(1,11).max());
        Optional<Integer> max= List.of(2,3,4,5,6,3,2,344,54,3).stream().max((x, y)->Integer.compare(x,y));
        System.out.println("maximum  " + max);
        System.out.println(IntStream.range(1,11).filter(x->x%2==0).boxed().collect(Collectors.toList()));

        List.of(2,3,4,5,3,23,43).stream().filter(new EvenNumberPredicate()).map(new SquareNumberFunction()).forEach(new EvenNumberPrintConsumer());

    }
}
