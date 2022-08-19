package com.catalisa.sistemadepagamento.controller;

import com.catalisa.sistemadepagamento.model.PagamentoModel;
import com.catalisa.sistemadepagamento.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PagamentoController {
    @Autowired
    private PagamentoService pagamentoService;

    @GetMapping(path = "/pagamento")
    public List<PagamentoModel> buscarTodosPagamentos() {
        return pagamentoService.buscartodos();
    }

    @GetMapping(path = "/pagamento/{indice}")
    public Optional<PagamentoModel> buscarPagamentoEspecifico(@PathVariable Long indice) {
        return pagamentoService.buscarId(indice);
    }

    @PostMapping(path = "/pagamento")
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentoModel registrarPagamento(@RequestBody PagamentoModel pagamentoModel) {
        return pagamentoService.registrar(pagamentoModel);
    }

    @PutMapping(path = "/pagamento/{indice}")
    public PagamentoModel alterarPagamento(@RequestBody PagamentoModel pagamentoModel) {
        return pagamentoService.alterar(pagamentoModel);
    }

    @DeleteMapping(path = "/pagamento/{indice}")
    public void deletarPagamento(@PathVariable Long indice) {
        pagamentoService.deletar(indice);
    }

}
