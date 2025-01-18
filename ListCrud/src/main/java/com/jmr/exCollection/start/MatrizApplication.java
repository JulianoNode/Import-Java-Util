package com.jmr.exCollection.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jmr.exCollection.start.service.MatrizService;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MatrizApplication implements CommandLineRunner {
	@Autowired
	private MatrizService service;

	public static void main(String[] args) {
		SpringApplication.run(MatrizApplication.class, args);
		
		System.out.println("GET http://localhost:8080/produtos/listar?page=0&size=5");
		System.out.println("PUT http://localhost:8080/produtos/atualizar-matriz");
	}

	@Override
	public void run(String... args) {
		List<List<Integer>> matrix = new ArrayList<>();
		int rows = 2, cols = 2;
		int counter = 1;

		int i = 0;
		while (i < rows) {
			List<Integer> row = new ArrayList<>();
			int j = 0;
			while (j < cols) {
				row.add(counter++);
				j++;
			}
			matrix.add(row);
			i++;
		}

		service.salvarMatriz(matrix);
	}
}
