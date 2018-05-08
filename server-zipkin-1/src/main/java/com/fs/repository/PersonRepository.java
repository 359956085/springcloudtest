package com.fs.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fs.pojo.Person;

@Repository
@Primary
public interface PersonRepository extends MongoRepository<Person, String>{

	Person findByUserId(Integer userId);
}
