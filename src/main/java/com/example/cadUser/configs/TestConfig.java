package com.example.cadUser.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.cadUser.repositories.UserRepository;

public class TestConfig implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
