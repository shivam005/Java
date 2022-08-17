package Java8;

import java.util.function.Consumer;

/*
* Consumer does not return anything rather it just consumes whatever is given to it.
* */
public class EvenNumberPrintConsumer implements Consumer {


    @Override
    public void accept(Object o) {
        System.out.println(o);
    }
}
