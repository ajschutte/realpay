package com.altamont.realpay.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;

import javax.persistence.ManyToOne;

@Entity
public class Transaction extends BaseEntity {

	private TransactionType transactionType;
	private BigDecimal amount;
	
	@ManyToOne
	private Account account;

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
}
