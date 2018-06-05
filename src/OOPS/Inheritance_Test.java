package OOPS;

public class Inheritance_Test {

	public static void main(String[] args) {
		Tester test = new Tester();
		Devloper devlop = new Devloper();
		// child class salary(),grade() will be given preference.
		test.salary();
		test.grade();
		test.testingActivity();// own method

		System.out.println("***************");

		devlop.salary();
		devlop.grade();
		devlop.developmentActivity();// own method

		System.out.println("***************");

		Employee_Inheritance emp = new Employee_Inheritance();
		// own methods
		emp.salary();
		emp.grade();
		// can't able to access child class properties
		System.out.println("***************");

		// up casting-Parent class reference can able to access child class
		// object
		// -Child class method given to prority over parent class as obj of
		// child class is created
		Employee_Inheritance emp1 = new Devloper();
		emp1.grade();
		emp1.salary();

		// can't able to access child class properties

		// downcasting
		// compile time allowed but run time gets an error class caste exception
		// Devloper dev1= (Devloper) new Employee_Inheritance();
		// dev1.developmentActivity();
	}

}
