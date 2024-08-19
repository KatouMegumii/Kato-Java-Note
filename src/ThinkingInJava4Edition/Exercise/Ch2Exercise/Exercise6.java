package ThinkingInJava4Edition.Exercise.Ch2Exercise;

//编写一个程序，让它含有本章所定义的storage()方法的代码段，并调用之。

public class Exercise6 {
    public static void main(String[] args) {
        Storage storage = new Storage();
        System.out.println(storage.storage("Hello World!"));
    }

    public static class Storage{
        public int storage(String s){
            return s.length() * 2;
        }
    }
}
