package com.jmr.exCollection.start.model;

import jakarta.persistence.*;
import java.util.List;

// Classe da entidade
@Entity
@Table(name = "matriz_dados")
public class Matriz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ElementCollection
    private List<List<Integer>> matrix;
    
    public Matriz() {}
    
    public Matriz(List<List<Integer>> matrix) {
        this.matrix = matrix;
    }
    
    public Long getId() { return id; }
    public List<List<Integer>> getMatrix() { return matrix; }
    public void setMatrix(List<List<Integer>> matrix) { this.matrix = matrix; }
}