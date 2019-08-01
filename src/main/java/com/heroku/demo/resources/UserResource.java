package com.heroku.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heroku.demo.models.User;
import com.heroku.demo.repositorys.UserRepository;

@RestController
@RequestMapping("/users")
public class UserResource {
	
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/todos")
	public List<User> todosAutores (){
		
		return userRepository.findAll();
	}
	
	
	
	@PostMapping("/new")
	public User salvar(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@DeleteMapping("/delete")
    public void delete(@PathVariable Long idUser) {
		userRepository.delete(idUser);
	}
	

}
