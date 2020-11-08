package com.kodilla.currency.mapper;

import com.kodilla.currency.domain.Currency;
import com.kodilla.currency.domain.CurrencyDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<CurrencyDto> mapToCurrencyDtoList(final List<Currency> currencyList) {
        return currencyList.stream()
                .map(c -> new CurrencyDto(c.getId(), c.getCurrency(), c.getValue()))
                .collect(Collectors.toList());
    }

}
