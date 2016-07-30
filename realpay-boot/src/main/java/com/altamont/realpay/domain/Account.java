package com.altamont.realpay.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Account extends BaseEntity {

	private long balance;
	
	@OneToMany
	private List<Transaction> transactions;

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

}
