package com.catalisa.sistemadepagamento.service;

import com.catalisa.sistemadepagamento.model.PagamentoModel;
import com.catalisa.sistemadepagamento.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {
    @Autowired
    private PagamentoRepository pagamentoRepository;

    public List<PagamentoModel> buscartodos() {
        return pagamentoRepository.findAll();
    }

    public Optional<PagamentoModel> buscarId(Long indice( {
        return pagamentoRepository.findById(indice);
    }

    public PagamentoModel cadastrar(PagamentoModel pagamentoModel) {
        pagamentoModel.getIndice();
        pagamentoModel.getStatus();
        pagamentoModel.getValorAPagar();
        pagamentoModel.getDiferencaValor();
        return pagamentoRepository.save(pagamentoModel);
    }


    public PagamentoModel alterar(PagamentoModel pagamentoModel) {
        pagamentoModel.getIndice();
        pagamentoModel.getStatus();
        pagamentoModel.getValorAPagar();
        pagamentoModel.getDiferencaValor();
        return pagamentoRepository.save(pagamentoModel);
    }

    public void deletar(Long indice) {
        pagamentoRepository.deleteById(indice);
    }
}
