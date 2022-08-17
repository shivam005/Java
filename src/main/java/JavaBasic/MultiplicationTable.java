package JavaBasic;

import javax.swing.*;
import java.net.StandardSocketOptions;

public class MultiplicationTable {

    public static void print(int table){
        for(int i=1;i<=10;i++) {
            System.out.printf(" %d X %d = %d",table,i,table*i).println();
        }

    }
    public static void main(String[] args) {
        MultiplicationTable MT = new MultiplicationTable();
        MT.print(3);
        System.out.println(MT.getClass());
    }
}
