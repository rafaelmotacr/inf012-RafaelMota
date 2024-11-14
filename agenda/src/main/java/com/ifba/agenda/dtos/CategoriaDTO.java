package com.ifba.agenda.dtos;

import com.ifba.agenda.entities.Categoria;

import jakarta.validation.constraints.NotBlank;

public record CategoriaDTO(Long categoriaId,
		@NotBlank(message = "O nome da categoria é obrigatório")
		String nome) {
	
	
	public CategoriaDTO(Categoria categoria) {
		this(categoria.getCategoriaId() , categoria.getNome());
	}

	
}
