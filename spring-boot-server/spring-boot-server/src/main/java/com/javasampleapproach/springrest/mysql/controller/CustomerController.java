package com.javasampleapproach.springrest.mysql.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.springrest.mysql.model.MC40200;
import com.javasampleapproach.springrest.mysql.repo.CustomerRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	CustomerRepository repository;

	@GetMapping("/customers")
	public List<MC40200> getAllCustomers() {
		System.out.println("Get all Customers...");

		List<MC40200> customers = new ArrayList<>();
		repository.findAll().forEach(customers::add);
		return customers;
	}

	@PostMapping(value = "/customers/create")
	public MC40200 postCustomer(@RequestBody MC40200 customer) {

		
		System.out.println(customer.getDEX_ROW_TS());
		MC40200 _customer = repository.save(new MC40200(customer. getCurncyid(),customer.getCrncydsc(),customer.getCrncydsca(),customer.getCRNCYSYM(),customer.getINCLSPAC(),customer.getNEGSYMBL(),customer.getNGSMAMPC(),customer.getDECSYMBL(),customer.getTHOUSSYM(),customer.getCURTEXT_1(),customer.getCURTEXT_2(),customer.getCURTEXT_3(),customer. getCURTEXTA_1(),customer. getCURTEXTA_2(),customer. getCURTEXTA_3(),customer.getDEX_ROW_TS(),customer.getDEX_ROW_ID() ));
		return _customer;
	}

}
