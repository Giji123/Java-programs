package encapsulation;

public class Studentdata {
	public static void main(String[] args) {
		Student s=new Student();
		s.setname("giji");
		System.out.println(s.getname());
		s.setrollno(4);
		System.out.println(s.getrollno());
		s.setname("sini");
		System.out.println(s.getname());
	}

}
