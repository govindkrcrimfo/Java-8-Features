package optionalClass;

import java.util.Optional;

/*
 * Optional class used to handle null pointer exception
 */
public class OptionalEx {
    public static String getName() {
        return "Govind";
    }

    public static String getName1() {
        return null;
    }

    public static void main(String[] args) {

        Optional<String> s = Optional.ofNullable(getName());
        s.ifPresent(k -> System.out.println(k));

        Optional k = Optional.ofNullable(getName1());
        String name = (String) k.orElse("Ramalal");
        System.out.println(name);
    }
}
