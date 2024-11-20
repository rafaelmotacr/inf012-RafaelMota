package com.ifba.store.entities;

import com.ifba.store.entities.dtos.CategoriaDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Categoria { 
 
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long categoriaId; 
    private String nome;
    
	public Categoria(Long categoriaId, String nome) {
		super();
		this.categoriaId = categoriaId;
		this.nome = nome;
	}
	
	public Categoria(CategoriaDTO categoriaDTO) {
		this.categoriaId = categoriaDTO.categoriaId();
		this.nome = categoriaDTO.nome();	
	}
	
	public Long getCategoriaId() {
		return categoriaId;
	}
	public void setCategoriaId(Long categoriaId) {
		this.categoriaId = categoriaId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}     
    
} 
