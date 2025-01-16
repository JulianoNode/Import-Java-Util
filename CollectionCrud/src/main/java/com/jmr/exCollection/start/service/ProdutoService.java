package com.jmr.exCollection.start.service;

import org.springframework.stereotype.Service;

import com.jmr.exCollection.start.model.Produto;
import com.jmr.exCollection.start.repository.ProdutoRepository;

import java.math.BigDecimal;
import java.util.Collection;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Collection<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }

    public BigDecimal calcularSomaPrecos() {
        return produtoRepository.somaPrecos();
    }
}