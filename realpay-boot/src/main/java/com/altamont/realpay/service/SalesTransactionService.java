package com.altamont.realpay.service;

import com.altamont.realpay.domain.SalesTransacation;

public interface SalesTransactionService {

	public SalesTransacation find(long id);
	
	public SalesTransacation save(SalesTransacation salesTransaction);
	
}
