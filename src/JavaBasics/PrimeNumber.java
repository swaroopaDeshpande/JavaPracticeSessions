package JavaBasics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11)
		// 2%2==0,2%1==0

		int num, i, count = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a Number : ");
		num = scan.nextInt();

		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.print("This is a Prime Number");
		} else {
			System.out.print("This is not a Prime Number");
		}
	}

}
