
public class Offseason extends Onseason {
	@Override
	public int discount(int total) {
		return (total*40)/100;
		
		
	}
	public static void main(String args[]) {
		Offseason m=new Offseason();
		Onseason d=new Onseason();
		
	System.out.println(	m.discount(2000));
	System.out.println(	d.discount(2000));
	}

}
