package JavaBasics;

import java.util.Scanner;

public class ODDandEVEN {

	public static void main(String[] args) {
		// no%2==0
		
		int no;
		System.out.println("Enter number");
		Scanner scan=new Scanner(System.in);
		no=scan.nextInt();
		if(no<1 )
		{
			System.out.println("");
		}
		else if(no%2==0)
		{
			System.out.println("Its an even number");
		}
		else
		{
			System.out.println("Its odd number");
		}
		

	}

}
