package com.kodilla.currency.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@Setter
@Getter
@Entity(name = "Transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private BigDecimal value;

    @Column
    private Date date;

    @ManyToOne
    @JoinColumn(name = "currencies_id")
    private Currency currency;

    public Transaction(Long id, BigDecimal value, Date date) {
        this.id = id;
        this.value = value;
        this.date = getDate();
    }
}
