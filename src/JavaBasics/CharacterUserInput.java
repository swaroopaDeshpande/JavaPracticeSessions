package JavaBasics;

import java.util.Scanner;

public class CharacterUserInput {

	public static void main(String[] args) {
		//ch = scan.next().charAt(0);
		
		char ch;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Character");
		ch=scan.next().charAt(0);
		System.out.println("You have enterd "+ ch );
	}

}
