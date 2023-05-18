package questionATM;

import java.util.Scanner;

public class Bank extends User{
	public void validatepin() {
	User n=new User();
	System.out.println("Enter the pin ");
		Scanner s=new Scanner(System.in);
		int c=s.nextInt();
		n.setpin(c);
		int m=n.getpin();
	if(m==1234|| m==1001||m==1212) {
		System.out.println("valid pin");
		}else {
			System.out.println("invalid pin");
		}

}
	public static void main(String []args) {
		Bank b=new Bank();
		b.validatepin();
	}
}