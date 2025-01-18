package com.jmr.exCollection.start.webController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jmr.exCollection.start.model.Matriz;
import com.jmr.exCollection.start.service.MatrizService;

import java.util.List;
import java.util.Optional;

//Controlador REST
@RestController
@RequestMapping("/api/matriz")
public class MatrizController {
	@Autowired
	private MatrizService service;

	@PostMapping
	public Matriz salvar(@RequestBody List<List<Integer>> matrix) {
		return service.salvarMatriz(matrix);
	}

	@GetMapping
	public List<Matriz> listar() {
		return service.listarTodas();
	}

	@GetMapping("/{id}")
	public Optional<Matriz> buscar(@PathVariable Long id) {
		return service.buscarPorId(id);
	}
}