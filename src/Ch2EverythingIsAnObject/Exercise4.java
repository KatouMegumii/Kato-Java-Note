package Ch2EverythingIsAnObject;

//跟exercise3本质上是一样的，创建类，再通过类创建具体的对象
//包含了练习5的内容

//跨文件访问的或者说仅写类在主函数中调用方法的解在Exercise4new文件夹中

public class Exercise4 {
    public static void main(String[] args) {
        class DataOnly {
            int i;
            double d;
            boolean b;
           // Exercise5
            void showData() {
                System.out.println("data.i = " + i);
                System.out.println("data.d = " + d);
                System.out.println("data.b = " + b);
            }
        }

        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        data.showData();
    }
}
