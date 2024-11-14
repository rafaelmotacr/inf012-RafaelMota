package com.ifba.agenda.dtos;

import com.ifba.agenda.entities.Contato;

public record ContatoDTO(Long contatoId,String nome,String telefone,String email, Long categoriaId) {
	
	
	public ContatoDTO(Contato contato) {
		this(contato.getContatoId(),contato.getNome(),contato.getTelefone(),contato.getEmail(), contato.getCategoria().getCategoriaId());
	}

	
}
