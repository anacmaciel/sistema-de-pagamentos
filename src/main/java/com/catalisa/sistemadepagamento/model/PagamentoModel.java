package com.catalisa.sistemadepagamento.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "registro_de_pagamentos")
public class PagamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long indice;
    @Column(length = 100, nullable = false)
    private String status;
    @Column(length = 10, nullable = false)
    private BigDecimal valorAPagar;
    @Column(length = 10, nullable = false)
    private BigDecimal diferencaValor;
    @Column(length = "10", nullable = false)
    private BigDecimal valorPago    ;
}
