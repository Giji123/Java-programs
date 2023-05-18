package Abstraction;

public class Calculatesalary {
	public static void main(String[] args) {
		Employee e=new Contractor();
		e.calculatesalary(5);
		Employee d=new Fulltimeemployee();
		d.calculatesalary(8);

}
}