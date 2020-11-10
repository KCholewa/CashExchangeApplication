package com.kodilla.currency.repository;

import com.kodilla.currency.domain.Transaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction, Long>{

    @Override
    List<Transaction> findAll();

    @Override
    Transaction save(Transaction transaction);

}
