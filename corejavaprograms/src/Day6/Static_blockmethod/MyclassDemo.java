package Day6.Static_blockmethod;

public class MyclassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass o1 = new MyClass();
		System.out.println(o1);

		// static method with class name
		MyClass.display();

		MyClass o2 = new MyClass();
		System.out.println(o2);
		MyClass.display();
		MyClass o3 = new MyClass();
		System.out.println(o3);
		MyClass.display();

	}

}