package com.altamont.realpay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altamont.realpay.domain.SalesTransacation;
import com.altamont.realpay.repository.SalesTransactionRepository;

@Service
public class BasicSalesTransaction implements SalesTransactionService {

	@Autowired
	SalesTransactionRepository repository;
	@Override
	public SalesTransacation find(long id) {
		return repository.findOne(id);
	}

	@Override
	public SalesTransacation save(SalesTransacation salesTransaction) {
		return repository.save(salesTransaction);
	}

}
