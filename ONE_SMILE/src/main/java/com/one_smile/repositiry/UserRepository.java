package com.one_smile.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one_smile.entity.User_table;

public interface UserRepository extends JpaRepository<User_table, Integer> {
	

}
