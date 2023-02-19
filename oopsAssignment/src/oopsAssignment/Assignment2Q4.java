package oopsAssignment;

abstract class A{          //   If any class has any of its method abstract then you must declare entire class abstract.
	abstract void show();		
}

abstract class B extends  A{  // When we extend an abstract class, we must either override all the abstract methods in sub class or declare subclass as abstract.
	@Override
	 void show() {
		System.out.println("I am a override method in class B");
	}
}
//private abstract class C{   // Abstract class cannot be private
//	
//}
//final abstract class D{     // Abstract class cannot be final
//	
//}
 abstract class E{         // You can declare a class abstract without having any abstract method.
	public void show() {
		System.out.println("I am a method without abstract type");
	}
}
public class Assignment2Q4 {

	public static void main(String[] args) {
		
//		A a = new A(); // Abstract class cannot be instantiated 
		
//		B b = new B(); // Abstract class cannot be instantiated 
		
//		C c = new C(); // Abstract class cannot be instantiated 
		
//		E e = new E(); // Abstract class cannot be instantiated 

System.out.println("It doesnt show anything because all classes are abstract ");
		

	}

}
