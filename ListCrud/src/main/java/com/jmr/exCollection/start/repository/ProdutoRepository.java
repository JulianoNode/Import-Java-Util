package com.jmr.exCollection.start.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.jmr.exCollection.start.model.Produto;

@Repository
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Long> {

	Produto save(Produto produto);
	List<Produto> findAll();
}