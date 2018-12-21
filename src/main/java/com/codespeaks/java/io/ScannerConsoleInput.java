package com.codespeaks.java.io;

import java.util.Scanner;

public class ScannerConsoleInput implements ConsoleInput {

	@Override
	public void acceptInput() {
		
	      try(Scanner sc = new Scanner(System.in)){        
	          
	          System.out.println("First Name :");
	          String firstName = sc.nextLine();
	          System.out.println("Last Name :");
	          String lastName = sc.nextLine();
	          
	          System.out.println("Age :");
	         
	          while(!sc.hasNextInt()) {
	        	  sc.next();
	        	  System.out.println("Age :");
	          }
	          
	          int age = sc.nextInt();

	          System.out.println("Login :");
	          String login = sc.next();
	          
	          System.out.println("password :");
	          String password = sc.next();
	          
	          System.out.println("Registration completes with following information collected...");
	          System.out.println("First Name : " + firstName);
	          System.out.println("Last Name : " + lastName);
	          System.out.println("Age : " + age);
	          System.out.println("Login : " + login);
	          System.out.println("password : " + password);
	          }
	}

}
