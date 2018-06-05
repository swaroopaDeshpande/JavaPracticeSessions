package JavaSessions;

public class TestDefault {

	public static void main(String[] args) {
		AccessModifiers_Default obj1 = new AccessModifiers_Default();
		// message() is havinng default access modifer(nothing is mentioned in
		// fron of method.
		// we can access it inside package.
		obj1.message();
	}

}
