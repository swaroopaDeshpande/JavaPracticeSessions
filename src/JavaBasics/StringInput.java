package JavaBasics;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		// str = scan.nextLine();
		String str;
		System.out.println("Enter str");
		
		Scanner scan= new Scanner(System.in);
		
		str=scan.nextLine(); 
		System.out.println("You have enter: "+ str);

	}

}
