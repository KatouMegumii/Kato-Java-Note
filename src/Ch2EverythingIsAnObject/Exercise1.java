package Ch2EverythingIsAnObject;

//创建一个类，包含一个int域和一个char域，它们都没有被初始化，将它们的值打印出来，以验证Java执行了默认初始化。

public class Exercise1 {
	static int i;
	static char c;
	public static void main(String[] args) {
		System.out.println("int = " + i);
		System.out.println("char = " + c);
	}
}
