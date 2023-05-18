package rbiinterface;

public class HDFC implements RBI{
	public void recurringDeposit(int amount,int duration) {
	
	int finalamount=amount+(amount*duration*rate)/100;
	System.out.println(finalamount);

}
	public static void main(String args[]) {
		RBI r=new HDFC();
		r.recurringDeposit(5000,2);
	}
}