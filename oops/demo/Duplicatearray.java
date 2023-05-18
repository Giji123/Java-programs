package demo;
import java.util.Scanner;

public class Duplicatearray {
	public static void main(String args[]) {
		int ar[]= {1,2,4,4};
		System.out.println("Enter number to check " );
		Scanner s = new Scanner(System.in) ;
			int c=s.nextInt();
			
			int count=0;
			for(int i=0;i<ar.length;i++) {
				if(ar[i]==c) {
					count++;
					continue;
					
				}
			}
			if(count>1) {
				System.out.println("duplicate element");
				
			}else {
				System.out.println("not duplicate element");
			}
		}
		
	
	

}
