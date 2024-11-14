package com.ifba.agenda.dtos;

import com.ifba.agenda.entities.Contato;

import jakarta.validation.constraints.NotBlank;

public record ContatoDTO(Long contatoId,
		@NotBlank(message = "O nome do contato é obrigatório")
		String nome,
		@NotBlank(message = "O telefone é obrigatório")
		String telefone,
		String email, 
		Long categoriaId) {
	
	
	public ContatoDTO(Contato contato) {
		this(contato.getContatoId(),contato.getNome(),contato.getTelefone(),contato.getEmail(), contato.getCategoria().getCategoriaId());
	}

	
}
