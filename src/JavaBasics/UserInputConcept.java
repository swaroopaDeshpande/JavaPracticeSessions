package JavaBasics;

import java.util.Scanner;

public class UserInputConcept {

	public static void main(String[] args) {
		// Scanner class
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		num = scan.nextInt();
		System.out.println("You entered :" + num);
	}

}
