package demo;

import java.util.Scanner;

public class Stringcharacters {
	public static void main(String args[]) {
	String s="How are you";
    //System.out.println("Enter character to check " );
	//Scanner d=new Scanner(System.in);
	//char c= d.nextLine().charAt(0);
	int space =0;
	int alpa =0;
	int digit=0;
	
	for(int i=0;i<s.length();i++) {
		if(Character.isAlphabetic(s.charAt(i))) {
	
			alpa++;
			continue;
		} else if(Character.isDigit(s.charAt(i))) {
			digit++;
		} else if(Character.isSpaceChar(s.charAt(i))){
			space++;
			
		}else {
			System.out.println("special character");
		}
	}
		System.out.println("is alphabet " +alpa);
		System.out.println("is digit " +digit);
		System.out.println("string has space " +space);
}
	
	
}
