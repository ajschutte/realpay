package com.altamont.realpay.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.altamont.realpay.domain.SalesTransacation;
import com.altamont.realpay.service.SalesTransactionService;

@RestController
public class SalesTransactionController {
	
	@Autowired
	SalesTransactionService service;
	
	@RequestMapping (value = "/salesTrans/{id}", method = RequestMethod.GET)
	public SalesTransacation getOne (@PathVariable ("id") long id){
		return service.find(id);
	}

}
