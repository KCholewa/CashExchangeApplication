package com.kodilla.currency.mapper;

import com.kodilla.currency.domain.Currency;
import com.kodilla.currency.domain.CurrencyDto;
import org.springframework.stereotype.Component;

@Component
public class CurrencyMapper {

    public Currency mapToCurrency(final CurrencyDto currencyDto) {
        return new Currency(
                currencyDto.getId(),
                currencyDto.getCurrency(),
                currencyDto.getValue());
    }

    public CurrencyDto mapToCurrencyDto(final Currency currency) {
        return new CurrencyDto(
                currency.getId(),
                currency.getCurrency(),
                currency.getValue());
    }

}
