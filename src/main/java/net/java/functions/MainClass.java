package net.java.functions;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class MainClass extends AbstractTest {

	public static void main(String[] args) {
		generateRandomNumber();
		generateRandomNumberInrange(1, 10);
	}

	public static void hashSetProgram() {
		Collection<Object> obj = new HashSet<>();
		obj.add("Shubham");
		obj.add(5);
		Iterator<Object> value = obj.iterator();

		while (value.hasNext()) {
			System.out.println(value.next());
		}
	}

	public static void reverseString() {
		Scanner scan = new Scanner(System.in);
		String inputValue = scan.next();
		System.out.println(inputValue);
		System.out.println(inputValue.length());
		if (inputValue.length() > 0) {
			for (int i = inputValue.length(); i >= inputValue.length() - 1; i--) {
				System.out.println(inputValue.charAt(i));
			}
		}

	}

	public static void reverseStringByWhileLoop() {
		String tes = "Shubham";
		int i = 0;
		while (tes.length() > i) {
			System.out.println(tes.charAt(i));
			i++;
		}

	}

	public static void printPalindrome() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();

		}
	}

	public static void factorialNum() {
		int Value = new Scanner(System.in).nextInt();
		int fact = 1;
		for (int i = 1; i <= Value; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

	}

	public static void checkOddNumber() {
		Scanner Testvalue = new Scanner(System.in);
		int value = Testvalue.nextInt();
		if (value > 0) {
			if (value % 2 == 0) {
				System.out.println("Even Number");
			} else {
				System.out.println("Odd Number");
			}
		}
	}

	public static void primeNumber() {
		boolean flag = false;
		Scanner Testvalue = new Scanner(System.in);
		int value = Testvalue.nextInt();
		if (value > 0) {
			for (int i = 2; i <= value / 2; i++) {
				System.out.println(i);
				if (value % i == 0) {
					flag = true;
					break;
				}
			}
			if (flag)
				System.out.println("Not prime num");
			else
				System.out.println("Prime");
		}

	}
	
	public static void numberOfPrimeNumber() {
		Scanner test=new Scanner(System.in);
		int checkUpto=test.nextInt();
		
	
	}

	public static void generateRandomNumber() {
		Random randomNum = new Random();

		
			System.out.println(randomNum.nextInt(2));
		
	}

	public static void generateRandomNumberInrange(int min, int max) {
		System.out.println("Testing is passed");
		Random random=new Random(); 
		if (min > max) {
			throw new IllegalArgumentException("Max number should be less than min number");
		}
		
		System.out.println(random.nextInt());

	}

}
