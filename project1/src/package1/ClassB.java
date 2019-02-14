package package1;

public class ClassB extends ClassA{
	int a=100;
	int b=200;
	public void add() {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
	ClassB objB= new ClassB();
	objB.add();
	System.out.println(objB.a);

	}

}
