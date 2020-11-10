package com.kodilla.currency.service;

import com.kodilla.currency.domain.Currency;
import com.kodilla.currency.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {

    @Autowired
    private CurrencyRepository currencyRepository;

    public List<Currency> getAllCurrencies() {
        return currencyRepository.findAll();
    }

    public Currency saveTask(final Currency currency) {
        return currencyRepository.save(currency);
    }

    public void deleteCurrencyById(final Long id) {
        currencyRepository.deleteById(id);
    }

    public Optional<Currency> getTaskByID(final long id) {
        return currencyRepository.findById(id);
    }
}
