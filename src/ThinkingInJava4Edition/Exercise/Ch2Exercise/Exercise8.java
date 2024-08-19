package ThinkingInJava4Edition.Exercise.Ch2Exercise;

//验证笔记里的情境2，静态变量是共享的
public class Exercise8 {
    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println(st1.i);
        System.out.println(st2.i);

        Incrementable.increment();

        System.out.println(st1.i);
        System.out.println(st2.i);

        st1.i = 3;

        System.out.println(st1.i);
        System.out.println(st2.i);
        ;
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