package com.iqmsoft.boot.vertx.repos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iqmsoft.boot.vertx.domain.Client;


public interface ClientRepository extends MongoRepository<Client, String> {

    List<Client> findByLastName(String lastName);
}
