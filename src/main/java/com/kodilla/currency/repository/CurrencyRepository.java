package com.kodilla.currency.repository;

import com.kodilla.currency.domain.Currency;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CurrencyRepository extends CrudRepository<Currency, Long> {

    @Override
    List<Currency> findAll();

    @Override
    Currency save(Currency currency);

}
