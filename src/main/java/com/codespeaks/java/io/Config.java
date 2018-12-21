package com.codespeaks.java.io;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean(name ="BufferedReaderConsoleInput")
	@ConditionalOnProperty(name="InputClass", havingValue="BufferedReader")
	public ConsoleInput getBufferedReaderConsoleInput() {
		return new BufferedReaderConsoleInput();
	}
	
	@Bean(name ="ConsoleConsoleInput")
	@ConditionalOnProperty(name="InputClass", havingValue="Console")
	public ConsoleInput getConsoleConsoleInput() {
		return new ConsoleConsoleInput();
	}
	
	@Bean(name ="ScannerConsoleInput")
	@ConditionalOnProperty(name="InputClass", havingValue="Scanner")
	public ConsoleInput getScannerConsoleInput() {
		return new ScannerConsoleInput();
	}


}
