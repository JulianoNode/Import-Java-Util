package com.jmr.exCollection.start.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmr.exCollection.start.model.Item;


@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
	Page<Item> findByNomeContaining(String nome, Pageable pageable);
}