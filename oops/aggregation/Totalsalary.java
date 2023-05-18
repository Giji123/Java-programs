package aggregation;

public class Totalsalary {
	
public static void totalsalary() {
	Salary s=new Salary();
	Hrapf d=new Hrapf();
	
	int c=s.basicpay();
	int e=s.deduction();
	int m=s.bonus();
	int ts=c+d.hra(c)-d.pf(c)-e+m;
	System.out.println("total salary in hand : " +ts);
}
public static void main(String args[]) {
	
	totalsalary();
	
}
}
