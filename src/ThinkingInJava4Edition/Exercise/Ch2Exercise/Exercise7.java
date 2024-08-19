package ThinkingInJava4Edition.Exercise.Ch2Exercise;

public class Exercise7 {
    public static void main(String[] args) {;
        System.out.println("StaticTest.i = " + StaticTest.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment() called:");
        System.out.println("StaticTest.i = " + StaticTest.i);
    }

    public static class StaticTest {
        static int i = 47;
    }

    public static class Incrementable {
        public static void increment() {
            StaticTest.i++;
        }
    }
}
