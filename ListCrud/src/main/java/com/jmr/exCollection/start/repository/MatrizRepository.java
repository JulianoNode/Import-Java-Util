package com.jmr.exCollection.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmr.exCollection.start.model.Matriz;

@Repository
public interface MatrizRepository extends JpaRepository<Matriz, Long> {

}