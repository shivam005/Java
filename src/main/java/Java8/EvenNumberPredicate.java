package Java8;

import java.util.function.Predicate;

/*
* Predicate just checks whether the result id true or false.
* */
public class EvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer number) {
        return number%2==0;
    }


}
