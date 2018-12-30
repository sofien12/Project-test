package com.javasampleapproach.springrest.mysql.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.springrest.mysql.model.MC40200;

public interface CustomerRepository extends CrudRepository<MC40200, Long> {
	
}
