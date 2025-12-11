package streamApi.stringQuestions;

import java.util.*;
import java.util.stream.Stream;

public class StringEx {
    public static void main(String[] args) {

        // Sample String
        String s="I am java developer";

        // Q1.Convert String to Stream of Characters
        Stream<Character> sc=s.chars().mapToObj(c->(char)c);

        // collect it in  List<Character> 
        List<Character> lc=s.chars().mapToObj(c->(char)c).toList();

        // Q2.Convert String to Stream of String
        Stream<String> ss=s.chars().mapToObj(c->String.valueOf((char)c));

        // collect it in List of string 
        List<String> ls=s.chars().mapToObj(c->String.valueOf((char)c)).toList();

        /* // **  Arrays.strem(s.split) ***
         *
         * Arrays.stream() works only on arrays.
         * When we call Arrays.stream(s.split("")), the split() method converts the String into a String array, 
         * and then Arrays.stream() converts that array into a Stream.
         */

        /*  // ** Joining ***
         *
         *  combine all elements into a single String , It returns String always.
         *  it combines base on delimeter we pass eg. " ", " ,", "_" etc
         *  ex- collect(Collectors.joining(", "));
         */


        //Q3.seperate each string based on spaces " "
        List<String> sl=Arrays.stream(s.split(" ")).toList();
        System.out.println(sl);
        System.out.println(s);
    }
}
