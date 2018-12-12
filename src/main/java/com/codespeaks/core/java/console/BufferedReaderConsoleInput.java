package com.codespeaks.core.java.console;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Register a customer via system console
 *
 */
public class BufferedReaderConsoleInput {
	
	public static void main(String[] args) {
		
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

		    System.out.println("First Name :");
			String firstName = br.readLine();
            System.out.println("Last Name :");
            String lastName = br.readLine();
			
            System.out.println("Age :");
            int age = Integer.parseInt(br.readLine());
            
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
		
//		try(BufferedReader br = new BufferedReader(new FileReader(new File("BufferedReaderCases.txt")))){
//			String line = null;
//			while((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}

}
