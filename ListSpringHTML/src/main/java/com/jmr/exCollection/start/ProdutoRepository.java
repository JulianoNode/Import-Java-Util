package com.jmr.exCollection.start;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Page<Produto> findAll(Pageable pageable);
}

