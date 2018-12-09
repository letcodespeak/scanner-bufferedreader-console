package com.codespeaks.core.java.console;

import java.util.Scanner;

public class ScannerTest {
	
	public  static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name:");
		
		String name = sc.nextLine();
		System.out.println("Hello " + name);
		
		System.out.println("How old are you ?");
		while (sc.hasNextInt()) {
		int age = sc.nextInt();
		System.out.println("Hello " + name +", aged at " + age);
		}
	}

}
