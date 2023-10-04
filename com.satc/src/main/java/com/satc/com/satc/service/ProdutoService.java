package com.satc.com.satc.service;
import com.satc.com.satc.Model.Produto;
import com.satc.com.satc.Model.QProduto;
import com.satc.com.satc.Model.Status;
import com.satc.com.satc.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> findProdutoAlugados() {
        List<Produto> alugados = repository.findAll(QProduto.produto.status.eq(Status.ALUGADO));
        return alugados;
    }

}
