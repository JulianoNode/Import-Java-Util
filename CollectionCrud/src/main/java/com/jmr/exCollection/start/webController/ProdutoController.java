package com.jmr.exCollection.start.webController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jmr.exCollection.start.model.Produto;
import com.jmr.exCollection.start.service.ProdutoService;

import java.math.BigDecimal;
import java.util.Collection;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto) {
        Produto novoProduto = produtoService.salvar(produto);
        return ResponseEntity.ok(novoProduto);
    }

    @GetMapping
    public ResponseEntity<Collection<Produto>> listarProdutos() {
        return ResponseEntity.ok(produtoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarProduto(@PathVariable Long id) {
        Produto produto = produtoService.buscarPorId(id);
        return produto != null ? ResponseEntity.ok(produto) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Long id) {
        produtoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/soma")
    public ResponseEntity<BigDecimal> calcularSomaPrecos() {
        return ResponseEntity.ok(produtoService.calcularSomaPrecos());
    }
}
