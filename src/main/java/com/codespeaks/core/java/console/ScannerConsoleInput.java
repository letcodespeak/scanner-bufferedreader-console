package com.codespeaks.core.java.console;

import java.util.Scanner;

public class ScannerConsoleInput
{
  public static void main (String[] args) {
      
      try(Scanner sc = new Scanner(System.in)){        
          
      System.out.println("First Name :");
      String firstName = sc.nextLine();
      System.out.println("Last Name :");
      String lastName = sc.n;
      
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
      }
  
  }
}
