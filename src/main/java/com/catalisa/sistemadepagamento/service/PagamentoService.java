package com.catalisa.sistemadepagamento.service;

import com.catalisa.sistemadepagamento.model.PagamentoModel;
import com.catalisa.sistemadepagamento.model.tipopagamento.PagamentoFactory;
import com.catalisa.sistemadepagamento.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {
    @Autowired
    private PagamentoRepository pagamentoRepository;

    public List<PagamentoModel> buscartodos() {
        return pagamentoRepository.findAll();
    }

    public Optional<PagamentoModel> buscarId(Long indice) {
        return pagamentoRepository.findById(indice);
    }

    public PagamentoModel registrar(PagamentoModel pagamentoModel) {
        PagamentoFactory pagamentoFactory = new PagamentoFactory();
        BigDecimal valor = pagamentoFactory.calculoPagamento(pagamentoModel.getStatus()).calculoPagamento(pagamentoModel);
        pagamentoModel.getIndice();
        pagamentoModel.getStatus();
        pagamentoModel.getValorAPagar();
        pagamentoModel.getDiferencaValor();
        pagamentoModel.setValorPago(valor);
        return pagamentoRepository.save(pagamentoModel);
    }


    public PagamentoModel alterar(PagamentoModel pagamentoModel) {
        PagamentoFactory pagamentoFactory = new PagamentoFactory();
        BigDecimal valor = pagamentoFactory.calculoPagamento(pagamentoModel.getStatus()).calculoPagamento(pagamentoModel);
        pagamentoModel.getIndice();
        pagamentoModel.getStatus();
        pagamentoModel.getValorAPagar();
        pagamentoModel.getDiferencaValor();
        pagamentoModel.setValorPago(valor);
        return pagamentoRepository.save(pagamentoModel);
    }

    public void deletar(Long indice) {
        pagamentoRepository.deleteById(indice);
    }
}
