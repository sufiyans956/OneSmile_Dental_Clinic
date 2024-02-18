package com.one_smile.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.one_smile.entity.Store;
import com.one_smile.entity.User_table;
import com.one_smile.services.StoreService;

@RestController
@RequestMapping("/store")
public class StoreController {

	@Autowired
	private StoreService sto;
	

	@GetMapping("/allstore")
	public Collection<Store> getallstore(){
		
		Collection<Store> allstore= sto.getAllStore();
		return allstore;
	}
	
	
	@PostMapping("/addstore")
	public Store addusers(@RequestBody Store newstore) {
		
		return sto.addstore(newstore);
	}
}
