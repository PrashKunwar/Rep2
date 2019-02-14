package package1;

public class MethodOverloading {

	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	public void add(double a, double b, double c) {
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(10, 20);
		obj.add(10, 20, 30);
		obj.add(1.234, 2.123);
		obj.add(1.234, 2.345, 3.456);

	}

}
