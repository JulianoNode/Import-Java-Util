package com.jmr.exCollection.start;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Page<Produto> listarProdutos(Pageable pageable) {
        return produtoRepository.findAll(pageable);
    }

    public Produto buscarProdutoPorId(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }

    // Exemplo de uso de List<E> com estrutura if-else
    public String verificarEstoque(Long id) {
        Produto produto = buscarProdutoPorId(id);
        if (produto == null) {
            return "Produto não encontrado!";
        }

        int quantidade = produto.getQuantidade();

        if (quantidade == 0) {
            return "Produto esgotado!";
        } else if (quantidade > 0 && quantidade <= 10) {
            return "Estoque baixo!";
        } else if (quantidade > 10 && quantidade <= 50) {
            return "Estoque médio!";
        } else if (quantidade > 50 && quantidade <= 100) {
            return "Estoque alto!";
        } else {
            return "Estoque cheio!";
        }
    }

    // Vetor para armazenar produtos temporariamente
    public Produto[] listarProdutosVetor() {
        List<Produto> lista = produtoRepository.findAll();
        return lista.toArray(new Produto[0]);
    }
}
