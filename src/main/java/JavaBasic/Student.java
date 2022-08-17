package JavaBasic;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Student {

    String name;
    int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

   public  int getNumberofMarks(int @NotNull [] marks){
        return marks.length;
   }

    private int getSumofMarks(int[] marks) {
        int sum=0;
        for(int mark:marks){
            sum= sum + mark;
        }
        return sum;
    }

    public BigDecimal getAverageMarks(int... marks) {
        int sum = getSumofMarks(marks);
        int l= getNumberofMarks(marks);
        BigDecimal avg= new BigDecimal(sum).divide(new BigDecimal(l),2, RoundingMode.UP);
        return avg;
    }
//   public int getMaxMarks(int [] marks){
//          Arrays.sort(marks);
//          int max=marks[marks.length-1];
//          return max;
//   }
    private int getMaxMarks(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int mark: arr){
            if(mark>max){
                max=mark;
            }
        }
        return max;
        }

    private int getMinMarks(int[] arr) {
        int min=Integer.MAX_VALUE;
        for(int mark: arr){
            if(min > mark){
                min=mark;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr={33,22,44,33,54,1,93,2,3};
        Student St= new Student("shivam", arr);
        System.out.println(St.getNumberofMarks(arr));
        System.out.println("max "+St.getMaxMarks(arr));
        System.out.println("min "+St.getMinMarks(arr));
        System.out.println(St.getSumofMarks(arr));
        System.out.println(St.getAverageMarks(arr));
        System.out.println(St);

    }



}
