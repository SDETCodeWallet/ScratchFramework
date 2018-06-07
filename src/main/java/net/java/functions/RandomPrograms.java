package net.java.functions;

import java.util.Scanner;

public class RandomPrograms {
	
	public static void main(String... args) {
		String testvalue="a";
		char test=testvalue.charAt(0);
		System.out.println(test);
		/*switchCaseProgram();*/
	}

	
	public static void switchCaseProgram() {
		Scanner test=new Scanner(System.in);
		String testvalue=test.next();
		
		switch(testvalue) {
		case "Shubham": System.out.println("Case 1");
		break; 
		case "ShubhamTest": System.out.println("Case 2");
		break;
		case "Shubhamtest3": System.out.println("Case 3");
		break; 
		case "Shubhamtest4": System.out.println("Case 4");
		break; 
		case "Shubhamtest5": System.out.println("Case 5");
		break; 
		default:  System.out.println("Last System");
		}	
	}
}
