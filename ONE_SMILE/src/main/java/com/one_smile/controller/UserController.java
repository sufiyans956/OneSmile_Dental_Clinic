package com.one_smile.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.one_smile.entity.User_role;
import com.one_smile.entity.User_table;
import com.one_smile.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private UserService userService;
	
	private User_role userrole;
	
	@GetMapping("/alluser")
	public Collection<User_table> getalluser(){
		
		Collection<User_table> allUsers= userService.getAllUsers();
		return allUsers;
	}
	
	@PostMapping("/adduser")
	public User_table addusers(@RequestBody User_table us) {
		//TODO: process POST request
		 if (us.getRole() == null) {
		        us.setRole(userrole.patient);
		    }
		return userService.adduser(us);
	}
	
	
	
	
	
}
