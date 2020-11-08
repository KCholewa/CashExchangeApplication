package com.kodilla.currency.service;

import com.kodilla.currency.domain.Currency;
import com.kodilla.currency.repository.CurrencyRepository;

import java.util.List;

public class DbService {
    private CurrencyRepository repository;

    public List<Currency> getAllCurrencies() {
        return repository.findAll();
    }

    public Currency saveTask(final Currency currency) {
        return repository.save(currency);
    }
}
