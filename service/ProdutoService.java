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


    public Produto salvar(Produto entity) {
        return repository.save(entity);
    }


    public List<Produto> buscaTodos() {
        return repository.findAll();
    }


    public Produto buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }


    public Produto alterar(Produto entity) {
        return repository.save(entity);
    }


    public void remover(Long id) {
        repository.deleteById(id);
    }
}
