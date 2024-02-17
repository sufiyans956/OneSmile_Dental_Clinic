package com.one_smile.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.one_smile.entity.Store;
import com.one_smile.repositiry.StoreRepository;

@Service
public class StoreService {

@Autowired
private StoreRepository storerepo;

public Collection<Store> getAllStore(){
	
	Collection<Store> allstore = storerepo.findAll();
	return allstore;
}

public Store addstore(Store newsto) {
	return storerepo.save(newsto);
}

}
