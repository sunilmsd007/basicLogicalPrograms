package logicalProgram;

import java.util.Scanner;

public class ReverseNumber {

        public static void main(String[] args) {
		
		int digit, reverse=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		while(number!=0) {
			digit = number % 10;
			reverse = reverse * 10 + digit;
			number/=10;
		}
		System.out.println("Reversed Number is: " +reverse);
        }
}
