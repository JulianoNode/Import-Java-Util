package com.jmr.exCollection.start.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.jmr.exCollection.start.model.Matriz;
import com.jmr.exCollection.start.repository.MatrizRepository;

@Service
public class MatrizService {
	@Autowired
	private MatrizRepository repository;

	public Matriz salvarMatriz(List<List<Integer>> matrix) {
		return repository.save(new Matriz(matrix));
	}

	public List<Matriz> listarTodas() {
		return repository.findAll();
	}

	public Optional<Matriz> buscarPorId(Long id) {
		return repository.findById(id);
	}
}