package JavaSessions;

public class ConstructorPracto {

	public ConstructorPracto()// default constructor
	{
		System.out.println("I am default Constructor");
	}

	public ConstructorPracto(String s) {
		System.out.println("I am singe parameterized constructor");
	}

	public ConstructorPracto(int i, int j) {
		System.out.println("I am two parametrozed Constructor");
	}

	public static void main(String[] args) {
		// i)What is constructor?
		// Characteristics-
		// 1.Its like function but not a function.
		// 2. Its does not return any value.
		// 3.its used to initialized instance/class vars.
		// 4. it's name should be exactly same as Class name.
		// 5.Constructor internally a non static method with non<init> and
		// return type void.
		// ii)Types of constructor
		// 1.Default constructor(zero parameter constructor)
		// 2.Constructor with parameters(Parameterized constructor)
		/*
		 * Can constructor be static:NO Constructors are used to initialize a
		 * newly created object. In Java, static means the member (like a method
		 * or variable) is at the class level, not the object level - therefore
		 * a static constructor doesn't make sense. A static initializer is used
		 * to set up a class, if needed.
		 */

		// How to call constructor:The moment you create object constructor is
		// called.
		// If you have not mentioned any constructor ,default in built
		// constructor going to be called by JVM.
		//its not complsory in constructor you can pass all class values.
		//Constructor can be overloaded.
		//diff between functions and constructor
		//
		
		ConstructorPracto obj=new ConstructorPracto();//default constructor
		ConstructorPracto obj1=new ConstructorPracto("Swara");//one param constructor called
		ConstructorPracto obj2= new ConstructorPracto(10,20);//two parameter constructor
	}

}
