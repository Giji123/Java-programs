package interfacee;

public class Additionn implements Summ{
	public void getsum(int a,int b) {
	int sum=a+b;
   System.out.println(sum);
}
public static void main(String args[]) {
	Summ s=new Additionn();
	s.getsum(4,6);
	
}
}