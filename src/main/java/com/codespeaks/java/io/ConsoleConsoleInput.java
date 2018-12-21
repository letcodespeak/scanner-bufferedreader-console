package com.codespeaks.java.io;

import java.io.Console;
import java.util.Objects;

import org.apache.commons.lang3.math.NumberUtils;

public class ConsoleConsoleInput implements ConsoleInput {

	@Override
	public void acceptInput() {

		Console console  = System.console();
		
		if (Objects.isNull(console)) {
			System.out.println("No system console found, exit!");
			System.exit(1);
		}
		String firstName = console.readLine("First Name :");
		String lastName = console.readLine("Last Name :");
		String ageString  = console.readLine("Age :");
		
        int age = 0;
        while (!NumberUtils.isNumber(ageString)){
        	ageString  = console.readLine("Age :");
        }
       
        age = Integer.parseInt(ageString);
        
        String login = console.readLine("Login :");
        String password = String.valueOf(console.readPassword("Password :"));
        
        console.printf("\r\nRegistration completes with following information collected...\r\n");
        console.printf("First Name : " + firstName + "\r\n");
        console.printf("Last Name : " + lastName + "\r\n");
        console.printf("Age : " + age + "\r\n");
        console.printf("Login : " + login + "\r\n");
        console.printf("password : " + password + "\r\n");
        
        
		
	}

}
