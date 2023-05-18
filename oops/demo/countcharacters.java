package demo;

public class countcharacters {
	public static void  main(String args[]) {
	String s="Welcome";	
	char tofind='l';
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==tofind) {
		count++;	
		
		continue;
		}
		
		
	}
	
	System.out.println(count);
	

}

	
}