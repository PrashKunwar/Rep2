package package1;

public class ClassC extends ClassB {
	int a=1;
	int b=2;
	public void add() {
		System.out.println(a+b);
	}
	
public static void main(String [] args) {
	ClassC objC= new ClassC();
	System.out.println(objC.a);
	objC.add();
	
}

} 
