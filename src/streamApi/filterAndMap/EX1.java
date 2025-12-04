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
         * 3. Find names whose length <5 & convert to uppercase
         */

        List<String> ls = Arrays.asList("Govind ", "Raj","kumar", "Gupta", "Howrah", "gopal","Ram","Golu");
        List<String> upperLs=ls.stream().map(s->s.toUpperCase()).toList();
        List<String > strtwithG=ls.stream().filter(s->s.toUpperCase().startsWith("G")).toList();
        List<String> lowerCase=ls.stream().filter(n->n.length()<5).map(n->n.toUpperCase()).toList();
        System.out.println("Upper case  string : "+upperLs);
        System.out.println("String starts with - "+strtwithG);
        System.out.println("Name converted to upper case whose length < 5 "+lowerCase );

        /*
         * From a number list, extract only odd numbers & multiply them by 3
         */
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> lOdd = l1.stream().filter(n -> n % 2 == 1).map(k -> 3*k).collect(Collectors.toList());
        System.out.println("odd number multiplye by 3 " + lOdd);

        /*
            1. mulitple filter -> find the number greater than 2 and less than 8
            2. multiple map -> double the nubmer then add 5 
         */
        List<Integer> rangeL=l1.stream()
        .filter(n->n>2)
        .filter(n->n<8).toList();
        System.out.println("Number greater than 2 and less than 8 "+rangeL);

        List<Integer> lmap=l1.stream()
        .map(n->n*2)
        .map(n->n+5).toList();
        System.out.println("doubled the nubmer then 5 added "+lmap);

    }
}
