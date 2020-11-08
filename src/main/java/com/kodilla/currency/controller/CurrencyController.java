package com.kodilla.currency.controller;

import com.kodilla.currency.domain.CurrencyDto;
import com.kodilla.currency.mapper.CurrencyMapper;
import com.kodilla.currency.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/v1/currency")
public class CurrencyController {

    @Autowired
    private DbService service;

    @Autowired
    private CurrencyMapper currencyMapper;

    @RequestMapping (method = RequestMethod.GET, value = "getCurrencies")
    public List<CurrencyDto> getCurrencies() {
        return currencyMapper.mapToCurrencyDtoList(service.getAllCurrencies());
    }

}
