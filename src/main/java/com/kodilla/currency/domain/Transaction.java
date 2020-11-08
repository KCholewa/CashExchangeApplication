package com.kodilla.currency.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@Entity(name = "Transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    BigDecimal value;

    @Column
    private Date date;
}
