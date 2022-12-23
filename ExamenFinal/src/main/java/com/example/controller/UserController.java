package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Bill;
import com.example.entities.User;
import com.example.repository.UserRepository;
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/{id}/bills")
	public List<Bill> getBillsById(@PathVariable Integer id) {
		Optional<User>usuario=userRepository.findById(id);
		if(usuario.isPresent()) {
			List<Bill> bills =usuario.getBills();
			return bills;
		}
		return null;
	}
	
	
	
	@PostMapping("/{id}/bills")
	public User postUsuario(@RequestBody User usuario) {
		
		userRepository.save(usuario);
		return usuario;
	}
	
	

}
