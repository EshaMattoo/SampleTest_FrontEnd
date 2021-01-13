package org.samplerun.main;

public class Abstractclass {

	public static void main(String[] args) {
		Shape s = new smell();// In a real scenario, object is provided through method, e.g., getShape()
								// method
		s.draw();
		s.smell1();
	}

}

 abstract class Shape {
	abstract void draw();
	abstract void smell1();
}

//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
	void smell1() {
		System.out.println("smell1");
	}
}

class Circle1 extends Shape {
		void draw() {
			System.out.println("drawing circle");
		}
		void smell1() {
			System.out.println("smell1");
		}
	}

class smell extends Shape {
	void draw() {
		System.out.println("smell");
	}
	void smell1() {
		System.out.println("smell1");
	}
}



