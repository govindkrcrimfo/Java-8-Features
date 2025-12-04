package streamApi.filterAndMap;

import java.util.*;
import java.util.stream.Collectors;

public class EX1 {
    public static void main(String[] args) {

        /*
         * Given a list of integers, return only even numbers.
         */

        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> evenNumbers = l.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.print("Even numbers " + evenNumbers);
        System.out.println();

        /*
         * 1.Convert list of strings to uppercase
         * 2.Filter strings that start with a specific character
         */

        List<String> ls = Arrays.asList("Govind ", "kumar", "Gupta", "Howrah", "gopal");
        List<String> upperLs=ls.stream().map(s->s.toUpperCase()).toList();
        List<String > strtwithG=ls.stream().filter(s->s.toUpperCase().startsWith("G")).toList();
        System.out.println("Upper case  string : "+upperLs);
        System.out.println();
        System.out.println("String starts with - "+strtwithG);

    }
}
