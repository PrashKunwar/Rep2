package package1;

public class Class1 {
	
	static int a=10, b=20;//Static variable
	int c=30, d=40; //non-static variable
	
	//Create static method with returning a value
	public static int add() { 
	int result=a+b;
	return result;	
	}

	//Create static method w/o returning any value
	public static void multiply() {
		System.out.println(a*b);
	}
	
	//Create a non-static method with returning a value
	public int add2() {
		int res= c+d;
		return res;
	}
	
	//Create non-static method w/o returning any value
	public void multiply2() {
		System.out.println(c*d);
	}
	
	public static void main(String [] args) {
		//Access static class members(using classname)
		int x=Class1.add();
		System.out.println(x);
		System.out.println(Class1.a);
		Class1.multiply();
		
		//Access non-static class members(using object)
		Class1 obj= new Class1();
		int y=obj.add2();
		System.out.println(y);
		System.out.println(obj.c);
		obj.multiply2();
	}
	
}
