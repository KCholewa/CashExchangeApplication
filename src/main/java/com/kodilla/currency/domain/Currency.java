package com.kodilla.currency.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "currencies")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String currency;

    @Column
    private BigDecimal value;

    @OneToMany(targetEntity = Transaction.class,
    mappedBy = "currency",
    cascade = CascadeType.ALL,
    fetch = FetchType.EAGER)
    private List<Currency> currencies = new ArrayList<>();

    public Currency(Long id, String currency, BigDecimal value) {
        this.id = id;
        this.currency = currency;
        this.value = value;
    }
}
