package problems;

public class Division extends Addition {
	public void division() {
		int a=super.sum();
		if(a%10==0) {
			System.out.println("sum is divisible by 10 ");
			
		}else {
			System.out.println("sum is not divisible by 10 ");
		}
		
	}
	public static void main(String[] args) {
		Division d=new Division();
		d.division();
	}

}
