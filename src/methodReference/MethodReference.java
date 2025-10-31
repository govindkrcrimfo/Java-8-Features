package methodReference;

import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> l = List.of(1, 2, 3, 4, 5);

        // printing without method reference
        l.forEach(i -> System.out.print(" " + i));
        System.out.println();
        // printing using Method Reference
        l.forEach(System.out::print);

    }
}
