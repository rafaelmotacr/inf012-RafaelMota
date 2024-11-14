package com.ifba.agenda.dtos;

import com.ifba.agenda.entities.Categoria;

public record CategoriaDTO(Long categoriaId,String nome) {
	
	
	public CategoriaDTO(Categoria categoria) {
		this(categoria.getCategoriaId() , categoria.getNome());
	}

	
}
