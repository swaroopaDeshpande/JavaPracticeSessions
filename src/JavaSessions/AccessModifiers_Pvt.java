package JavaSessions;

public class AccessModifiers_Pvt {
	
	private int data=40;
	

	public static void main(String[] args) {
		// There are two types of modifiers in java: access modifiers and
		// non-access modifiers.
		// The access modifiers in java specifies accessibility (scope) of a
		// data member, method, constructor or class.
		// private
		// default
		// protected
		// public

		// non-access modifiers such as static, abstract, synchronized, native,
		// volatile, transient etc.

		// 1) private access modifier
		// The private access modifier is accessible only within class.
		AccessModifiers_Pvt obj=new AccessModifiers_Pvt();
		System.out.println(obj.data);
		
		obj.message();
		
		
	}
	
	private void message()
	{
		System.out.println("Hello World");
	}

}
