package Ch2EverythingIsAnObject;

//找出含有ATypeName的代码段，并将其改写为一个完整的程序
//2.4含有这个的代码段，但是不知道这个代码段到底要干什么 这个是参考答案写的，show了不同类变量

public class Exercise3 {
    public static void main(String[] args) {
        class ATypeName {
            int i;
            double d;
            boolean b;

            void show() {
                System.out.println("int = " + i);
                System.out.println("double = " + d);
                System.out.println("boolean = " + b);
            }
        }
        ATypeName a = new ATypeName();
        a.i = 3;
        a.d = 3.14;
        a.b = true;
        a.show();
    }
}
