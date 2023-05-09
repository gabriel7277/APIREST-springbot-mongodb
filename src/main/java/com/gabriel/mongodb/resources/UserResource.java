package com.gabriel.mongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.mongodb.domain.User;


@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("0", "maria", "maria@gmail.com");
		User gabriel = new User("7", "gabriel","gabriel@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, gabriel));
		return ResponseEntity.ok().body(list);
	}

}
