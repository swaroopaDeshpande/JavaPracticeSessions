package JavaSessions;

public class Employee_ConstructorConcept {
	// class/instance variables:Scope upto full class
	// we need to initialised class variables using constructor
	int age;
	String name;
	String dept;

	public Employee_ConstructorConcept(int age, String name, String dept)// age,name,dept
																			// are
																			// Local
																			// vars.scope
																			// is
																			// till
																			// this
																			// method
	// initialized class variables as local variables we need to use "this"
	// keyword.(when class var name and local var name same)
	// advt of constructor:you can create different values and assign it to vars
	// while creating diff objects.No need to write seperate code.
	{
		this.age = age;
		this.name = name;
		this.dept = dept;

	}

	public static void main(String[] args) {
		Employee_ConstructorConcept e1 = new Employee_ConstructorConcept(28, "Swaroopa", "QA");
		Employee_ConstructorConcept e2 = new Employee_ConstructorConcept(30, "Tom", "Dev");
		Employee_ConstructorConcept e3 = new Employee_ConstructorConcept(25, "Jerry", "Admin");

		System.out.println(e1.age);
		System.out.println(e1.dept);
		System.out.println(e1.name);
		System.out.println("*******************");
		System.out.println(e2.age);
		System.out.println(e2.dept);
		System.out.println(e2.name);
		System.out.println("*******************");
		System.out.println(e3.age);
		System.out.println(e3.dept);
		System.out.println(e3.name);
	}

}
