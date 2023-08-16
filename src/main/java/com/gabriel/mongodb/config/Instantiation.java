package com.gabriel.mongodb.config;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.gabriel.mongodb.domain.Post;
import com.gabriel.mongodb.domain.User;
import com.gabriel.mongodb.dto.AuthorDTO;
import com.gabriel.mongodb.repository.PostRepository;
import com.gabriel.mongodb.repository.UserRepository;

	@Configuration
	public class Instantiation implements CommandLineRunner {

		@Autowired
		private UserRepository userRepository;

		@Autowired
		private PostRepository postRepository;

		@Override
		public void run(String... arg0) throws Exception {

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
			
			userRepository.deleteAll();
			postRepository.deleteAll();
			

			User gabriel = new User(null, "Gabriel Ribeiro", "gabriel@gmail.com");
			User Gabriel  = new User(null, "Gabriel Fernandes", "gabriel@gmail.com");
			
			userRepository.saveAll(Arrays.asList(gabriel, Gabriel));

			Post post10 = new Post(null, sdf.parse("22/03/2018"), "Partiu viagem", "Vou viajar para  o Rio de Janeiro.",new AuthorDTO(gabriel));

			Post post20 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje!",  new AuthorDTO(Gabriel));

			postRepository.saveAll(Arrays.asList(post10, post20));
			
			gabriel.getPosts().addAll(Arrays.asList(post10, post20));
			userRepository.save(gabriel);
		}

	}

