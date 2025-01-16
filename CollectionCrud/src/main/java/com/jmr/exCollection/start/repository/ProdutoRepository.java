package com.jmr.exCollection.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jmr.exCollection.start.model.Produto;

import java.math.BigDecimal;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Query("SELECT SUM(p.preco) FROM Produto p")
    BigDecimal somaPrecos();
}