package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@GetMapping("/user")
	String getUser() {
		System.out.println("testing");
		return "testing";
	}
	@PostMapping("/user")
	void createUser(@RequestBody User user) {
		System.out.println(user.getName());
		userService.saveUser(user);
		
	}
	@DeleteMapping("/user") 
	void deleteUser() {
		
	}

}
