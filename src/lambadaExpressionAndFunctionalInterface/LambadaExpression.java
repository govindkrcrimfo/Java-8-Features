package lambadaExpressionAndFunctionalInterface;

/*
 * Functional Interface 
 * -> having only one abstract method 
 * -> Functional interface is primarly condition to use Lambada expression
 */
@FunctionalInterface
interface Sum {
    int sum(int a, int b);
}

@FunctionalInterface
interface Sum1 {
    int sum(int a, int b);
}

public class LambadaExpression {
    public static void main(String args[]) {
        System.out.println("Hello Lamabada expression");

        /*
         * This way we can also call a method of an interface
         * as we know we cann't create object of inteface
         * Sum s=new Sum() { } here we have not created object of sum
         * we are creating annyomous funtion
         * we are creating annyomous funtion
         */

        Sum s = new Sum() {
            public int sum(int a, int b) {
                return a + b;
            }
        };
        int ans = s.sum(5, 6);
        System.out.println("sum using annonymous funtion " + ans);

        // lambda expression
        Sum1 s1 = (int a, int b) -> {
            return a + b;
        };
        int ans1 = s1.sum(5, 6);
        System.out.println("sum using lambda expression = " + ans1);

    }
}