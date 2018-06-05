package JavaSessions;

public class AccessModifier_Pub {
	
	public void msgPub(){
		System.out.println("Hello");
		}  


	public static void main(String[] args) {
		AccessModifier_Pub obj= new AccessModifier_Pub();
		obj.msgPub();
	}

}
