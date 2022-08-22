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
    @Column(name = "valor_a_pagar", length =100, nullable = false)
    private BigDecimal valorAPagar;
    @Column(name = "diferenca_valor", length = 100, nullable = false)
    private BigDecimal diferencaValor;
    @Column(name = "valor_pago", length = 100)
    private BigDecimal valorPago    ;
}
