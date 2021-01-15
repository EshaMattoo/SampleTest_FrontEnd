package org.samplerun.main;

public class Interfaceclass {

	public static void main(String[] args) {
		smell3 s = new smell3();// In a real scenario, object is provided through method, e.g., getShape()
								// method
		s.draw1();
		s.smell2();
		s.smell3();
	}

}

 interface  Shape1 {
	 public void draw1();
	 
}
 
 interface  Shape2 {
	
	 public void smell2();
}
 interface  Shape3 {
		
	 public void smell3();
	 public static void a() {
		}
}

//In real scenario, implementation is provided by others i.e. unknown by end user  
/*class Rectangle1 extends Shape1 {
	void draw1() {
		System.out.println("drawing rectangle");
	}
	void smell2() {
		System.out.println("smell1");
	}
}

class Circle2 extends Shape {
		void draw1() {
			System.out.println("drawing circle");
		}
		void smell2() {
			System.out.println("smell1");
		}
	}*/
 
 //multiple implements from different classes

class smell3 implements Shape1,Shape2,Shape3 {
	public void draw1() {
		System.out.println("smell");
	}
	public void smell2() {
		System.out.println("smell1");
	}
	public void smell3() {
		System.out.println("smell3");
	}
	
}



