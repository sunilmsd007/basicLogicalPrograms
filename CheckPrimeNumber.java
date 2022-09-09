package logicalProgram;

import java.util.Scanner;

public class CheckPrimeNumber {

	
	public static void main(String[] args) {

		boolean flag = true;
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		    for (int i = 2; i <= number / 2; ++i) {
		      if (number % i == 0) {
		        flag = false;
		        break;
		      }
		    }

		    if (flag)
		      System.out.println(number + " is a prime number.");
		    else
		      System.out.println(number + " is not a prime number.");
}
}
