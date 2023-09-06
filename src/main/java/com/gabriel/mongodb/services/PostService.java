package com.gabriel.mongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.mongodb.domain.Post;
import com.gabriel.mongodb.exception.ObjectNotFoundException;
import com.gabriel.mongodb.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	

	public Optional<Post> findById(String id) {

		Optional<Post> user = repo.findById(id);

		if(user == null) {

		throw new ObjectNotFoundException("Objeto não encontrado");

		}

		return user;
	   }
	
		public List<Post> findByTitle(String text){
			return repo.searchTitle(text);
	}
}
