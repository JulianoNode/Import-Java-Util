package com.jmr.exCollection.start.webController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jmr.exCollection.start.model.Produto;

import com.jmr.exCollection.start.service.ProdutoService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

//Controlador REST
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping("/listar")
	public ResponseEntity<Page<Produto>> listarProdutos(Pageable pageable) {
		return ResponseEntity.ok(produtoService.listarProdutosPaginados(pageable));
	}

	@PutMapping("/atualizar-matriz")
	public ResponseEntity<?> atualizarPrecos() {
		return ResponseEntity.ok(produtoService.processarMatrizDePrecos());
	}
}