package com.codespeaks.core.java.console;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderCases {
	
	public static void main(String[] args) {
		
		
//		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//			System.out.println("Please enter your name:");
//			String name = br.readLine();
//			System.out.println("Hello " + name);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try(BufferedReader br = new BufferedReader(new FileReader(new File("BufferedReaderCases.txt")))){
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
