package inheritance;

public class Division extends Sumanddivision {
	public void division(){
		if(sum()%10==0) {
			System.out.println("result is divisible by 10 ");
		}else {
			System.out.println("result is not divisible by 10 ");	
		
		
	}
	}
		public static void main(String args[]) {
			Division d=new Division();
			d.division();
			
		}


}
