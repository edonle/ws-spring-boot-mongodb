package com.example.wsmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.wsmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	
}
