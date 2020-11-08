package com.kodilla.currency.repository;

import com.kodilla.currency.domain.Currency;
import org.springframework.data.repository.CrudRepository;

public interface CurrencyRepository extends CrudRepository<Currency, Long> {

}
