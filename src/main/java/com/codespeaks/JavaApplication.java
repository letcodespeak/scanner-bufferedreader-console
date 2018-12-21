package com.codespeaks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codespeaks.java.io.ConsoleInput;

@SpringBootApplication
public class JavaApplication implements CommandLineRunner{
	
	@Autowired
	private ConsoleInput consoleInput;

	public static void main(String[] args) {
		SpringApplication.run(JavaApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		consoleInput.acceptInput();
	}
	
	

}

