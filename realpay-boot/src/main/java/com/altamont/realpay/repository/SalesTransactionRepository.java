package com.altamont.realpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altamont.realpay.domain.SalesTransacation;

public interface SalesTransactionRepository extends JpaRepository <SalesTransacation, Long> {

}
