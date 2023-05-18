package aggregation;

import java.util.Scanner;

public class Salary {
	public int basicpay() {
		System.out.println("Enter the basic pay: ");
		Scanner s=new Scanner(System.in);
		int c=s.nextInt();
		return c;
	}
	public int deduction() {
		System.out.println("Enter the deduction amount: ");
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		return d;
}
	public int bonus() {
		System.out.println("Enter the bonus: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		return a;
}
	
}