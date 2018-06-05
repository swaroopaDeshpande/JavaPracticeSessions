package JavaSessions;

public class AccessModifiers_Protected {
	
	protected void messageProtected()
	{
		System.out.println("Protected Access Modifier");
	}

	public static void main(String[] args) {
		// protected access modifier
		// The protected access modifier is accessible within package and
		// outside the package but through inheritance only.
		// The protected access modifier can be applied on the data member,
		// method and constructor. It can't be applied on the class.
		
		AccessModifiers_Protected obj=new AccessModifiers_Protected();
		obj.messageProtected();
				

	}

}
