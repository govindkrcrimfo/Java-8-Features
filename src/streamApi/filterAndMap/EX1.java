package streamApi.filterAndMap;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * Given a list of integers, return only even numbers.
*/
public class EX1 {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> evenNumbers=l.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.print("Even numbers "+ evenNumbers );
        System.out.println();
    } 
}
