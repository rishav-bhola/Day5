/**
 * Created by bholar on 7/10/2017.
 */

class OuterClass8 {
    private OuterClass8(int x) {
        System.out.println("x: " + x);
    }

    static class InnerClass {

        public void xyz(){}
        public static void test() {
            OuterClass8 outer = new OuterClass8(1);
        }
    }
}


public class StaticInnerClass {
    public static void main(String[] args) {
        OuterClass8.InnerClass.test();
        // OuterClass8 outer = new OuterClass8(1); // It is not possible to create outer instance from outside.
    }
}

