package JavaSessions;

public class AccessModifiers_Default {

	public static void main(String[] args) {
		// If you don't use any modifier, it is treated as default bydefault.
		// The default modifier is accessible only within package.
		AccessModifiers_Default obj=new AccessModifiers_Default();
		obj.message();
		

	}

	void message()
	{
		System.out.println("Default modifier in java");
	}
}
