package com.one_smile.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.one_smile.entity.User_table;
import com.one_smile.repositiry.UserRepository;

@Service
public class UserService {
	
@Autowired
private UserRepository userRepo;


public Collection<User_table> getAllUsers(){
	
	Collection<User_table> allUsers = userRepo.findAll();
	return allUsers;
}

public User_table adduser(User_table user) {
	return userRepo.save(user);
}




}
