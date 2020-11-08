package com.kodilla.currency.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class CurrencyDto {

    private Long id;
    private String currency;
    private BigDecimal value;
}
