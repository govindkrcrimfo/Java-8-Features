package streamApi.stringQuestions;

import java.io.StringReader;
import java.util.*;
import java.util.stream.Collectors;
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
        System.out.println();

        // Q4.reverse a string s=s="I am java developer";
        String rev = s.chars().mapToObj(c -> String.valueOf((char) c))
                .reduce(" ", (a, b) -> b + a);
        System.out.println("reversed String " + rev);
        System.out.println();

        //Q5. reverse words in a sentence 
        // s=s="I am java developer";
        // output ="developer java am I";

        String rd=Arrays.stream(s.split(" "))
        .reduce("", (a ,b )->b+" "+a).trim();
        System.out.println("only word reversed :- "+rd);
        System.out.println();

        //Q6.reverse each word in a sentence 
        // s=s="I am java developer";
        // output ="I ma avaj repoleved";
        String rwd=Arrays.stream(s.split(" "))
        .map(k->new StringBuilder(k).reverse().toString())
        .collect(Collectors.joining(" "));
        System.out.println("wordwise reverse : - "+rwd);
        System.out.println();
        
        


          
        
    }
}
