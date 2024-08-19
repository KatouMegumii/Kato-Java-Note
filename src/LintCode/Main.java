package LintCode;

public class Main {
    static {
        s = "this is a string";
    }

    public static String s;

    public static void main(String[] args) {
        System.out.println(s);
    }
}


/*
public class Main {
    public static void main(String[] args){
        Test test1 = new Test();
        System.out.println(test1.a);

        Test test2 = new Test();
        System.out.println(test2.a);

        System.out.println(Test.a);
    }
    public static class Test {
        public static int a = 47;
    }
}
*/



/*
public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        boolean flag = test.flag();
        System.out.println(flag);
    }

    public static class Test {
        public boolean flag() {
            return true;
        }
    }
}

*/

/*
public class Main {
    public static void main(String[] args) {
        SortByLength solution = new SortByLength();
        String[] strArr = {"lint", "code", "java", "python", "javascript"};
        solution.sortByLength(strArr);
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        int age = new People(1).age;
        int count = People.count;
        System.out.println(count);
        int age2 = new People(2).age;
        int count2 = People.count;
        System.out.println(count2);
    }

    public static class People {
        public int age;
        public static int count;

        public People(int age) {
            this.age = age;
            count++;
        }
    }
}
*/


