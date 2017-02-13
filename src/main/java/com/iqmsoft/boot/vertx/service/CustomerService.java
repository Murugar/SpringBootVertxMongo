package com.iqmsoft.boot.vertx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqmsoft.boot.vertx.domain.Client;

import com.iqmsoft.boot.vertx.repos.ClientRepository;

@Service
public class CustomerService {

   
    private ClientRepository repository;
    

    public CustomerService() {
        super();
    }
	
	@Autowired
	public CustomerService(ClientRepository repository){
		this.repository = repository;
	}


    public Iterable<Client> findAll() {
        return repository.findAll();
    }

    public Client save() {
        return repository.save(new Client("toto", "tata"));
    }
}


