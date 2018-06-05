package AccessModifiers;

import JavaSessions.AccessModifiers_Default;

public class TestDefaultinAnotherPackage {

	public static void main(String[] args) {
		AccessModifiers_Default obj1 = new AccessModifiers_Default();
		// The method message() from the type AccessModifiers_Default is not
		// visible
		//obj1.message();
	}

}
