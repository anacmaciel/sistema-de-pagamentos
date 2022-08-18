package com.catalisa.sistemadepagamento.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "pagamentos")
public class PagamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long indice;
    @Column(length = 100, nullable = false)
    private String status;
    @Column(length = 100, nullable = false)
    private BigDecimal valorAPagar;
    @Column(value = 100, nullable = false)
    private BigDecimal diferencaValor;
}
