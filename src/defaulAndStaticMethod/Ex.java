package defaulAndStaticMethod;

interface Student {

    default void sayNamaste() {
        System.out.println("Namaste Students");
    }

    public static void sayHello() {
        System.out.println("Hello Students");
    }
}

/*
 * To call defaul method we must implement interface class,
 * But static method can called directly with class.method name
 */
class StudentImpl implements Student {

}

public class Ex {
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl();
        student.sayNamaste();
        Student.sayHello();
    }
}
