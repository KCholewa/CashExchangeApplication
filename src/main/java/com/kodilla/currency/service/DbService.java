package com.kodilla.currency.service;

import com.kodilla.currency.domain.Currency;
import com.kodilla.currency.domain.CurrencyDto;
import com.kodilla.currency.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {

    @Autowired
    private CurrencyRepository repository;

    public List<Currency> getAllCurrencies() {
        return repository.findAll();
    }

    public Currency saveTask(final Currency currency) {
        return repository.save(currency);
    }


}
