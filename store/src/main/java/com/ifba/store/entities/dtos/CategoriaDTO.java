package com.ifba.store.entities.dtos;

import com.ifba.store.entities.Categoria;

public record CategoriaDTO  (Long categoriaId, String nome){

	public CategoriaDTO(Categoria categoria) {
		this(categoria.getCategoriaId(),
				categoria.getNome());
	}
	
}
