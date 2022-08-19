package com.catalisa.sistemadepagamento.model.tipopagamento;

import com.catalisa.sistemadepagamento.model.PagamentoModel;

import java.math.BigDecimal;

public interface CalculoPagamento {
BigDecimal calculoPagamento(PagamentoModel pagamentoModel);
}
}
