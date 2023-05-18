package Abstraction;

public  class Contractor extends Employee{
	public void calculatesalary(int r) {
		
		int salary=200*r;
		System.out.println("Salary of contractor " +salary);
	}

}
