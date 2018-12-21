package com.codespeaks.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.lang3.math.NumberUtils;

public class BufferedReaderConsoleInput implements ConsoleInput{

	@Override
	public void acceptInput() {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

		    System.out.println("First Name :");
			String firstName = br.readLine();
            System.out.println("Last Name :");
            String lastName = br.readLine();
			
            System.out.println("Age :");
            
            String ageString = br.readLine();
            int age = 0;
            while (!NumberUtils.isNumber(ageString)){
            	 System.out.println("Age :");
            	 ageString = br.readLine();
            }
           
            age = Integer.parseInt(ageString);
            
            System.out.println("Login :");
            String login = br.readLine();
            
            System.out.println("password :");
            
            String password = br.readLine();
            
            System.out.println("Registration completes with following information collected...");
            System.out.println("First Name : " + firstName);
            System.out.println("Last Name : " + lastName);
            System.out.println("Age : " + age);
            System.out.println("Login : " + login);
            System.out.println("password : " + password);
            
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
