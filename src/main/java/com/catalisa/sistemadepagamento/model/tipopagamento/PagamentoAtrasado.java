package com.catalisa.sistemadepagamento.model.tipopagamento;

import com.catalisa.sistemadepagamento.model.PagamentoModel;

import java.math.BigDecimal;

public class PagamentoAtrasado implements CalculoPagamento {
    @Override
    public BigDecimal calculoPagamento(PagamentoModel pagamentoModel) {
        return pagamentoModel.getValorAPagar().add(pagamentoModel.getDiferencaValor());
    }
}
