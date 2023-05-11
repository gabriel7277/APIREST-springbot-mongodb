package com.gabriel.mongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.gabriel.mongodb.domain.User;
import com.gabriel.mongodb.repository.UserRepository;

@Configuration
public class instatiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User gabriel = new User(null, "gabriel", "gabriel@gmai.com");
		User gb = new User(null, "gb", "gb@gmai.com");
		
		userRepository.saveAll(Arrays.asList(gabriel, gb));
	}

}
