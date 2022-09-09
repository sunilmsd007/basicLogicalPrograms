package logicalProgram;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
	int n1=0, n2=1, n3;	
	Scanner sc  = new Scanner(System.in);
	System.out.println("enter the number");
	int number = sc.nextInt();
	for(int i=1; i<=number; i++) {
	System.out.print(n1+" ");
	n3 = n1+ n2;
	n1=n2;
	n2=n3;
	}
}
}
