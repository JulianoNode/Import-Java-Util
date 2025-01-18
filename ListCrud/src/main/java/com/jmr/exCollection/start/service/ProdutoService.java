package com.jmr.exCollection.start.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import com.jmr.exCollection.start.model.Produto;
import com.jmr.exCollection.start.repository.ProdutoRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Page<Produto> listarProdutosPaginados(Pageable pageable) {
        return produtoRepository.findAll(pageable);
    }

    public List<Produto> processarMatrizDePrecos() {
        List<Produto> produtos = (List<Produto>) produtoRepository.findAll();
        
        double[][] matriz = new double[produtos.size()][2];
        int i = 0;

        while (i < produtos.size()) {
            Produto produto = produtos.get(i);
            matriz[i][0] = produto.getId();
            matriz[i][1] = produto.getPreco() * 1.10; // Simulando um aumento de 10%
            i++;
        }

        List<Produto> produtosAtualizados = new ArrayList<>();
        i = 0;
        while (i < produtos.size()) {
            Produto produto = produtos.get(i);
            produto.setPreco(matriz[i][1]);
            produtosAtualizados.add(produtoRepository.save(produto));
            i++;
        }

        return produtosAtualizados;
    }
}