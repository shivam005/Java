package Java8;

import java.util.function.Function;
/*
* Functions takes the input and gives the output
* */
public class SquareNumberFunction implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer x) {
        Integer y = x*x;
        return y;
    }
}
