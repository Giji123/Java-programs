package superclass;

public class Child extends Parent{
	public Child(){
		super();
	    System.out.println("sum");
	}
	void m2() {
		super.m1();
	}
	public static void main(String args[]) {
		Child d=new Child();
		d.m2();
		
	}

}
