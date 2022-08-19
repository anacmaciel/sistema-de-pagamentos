package com.catalisa.sistemadepagamento.model.tipopagamento;

public class PagamentoFactory {

    public CalculoPagamento calculoPagamento(String tipoDePagamento) {
        if (tipoDePagamento.equalsIgnoreCase("pagamento_atrasado")) {
            return new PagamentoAtrasado();
        } else if (tipoDePagamento.equalsIgnoreCase("pagamento_em_dia")) {
            return new PagamentoEmDia();
        } else  {
            return null;
        }
    }
}
