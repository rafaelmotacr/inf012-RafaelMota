package com.ifba.store.entities.dtos;

import com.ifba.store.entities.Cliente;
import com.ifba.store.entities.Endereco;

public record ClienteDTO(Long clienteId, String nome, String email, String telefone, Endereco endereco)  {

	public ClienteDTO(Cliente cliente) {
		this(cliente.getClienteId(),
				cliente.getNome(),
				cliente.getEmail(),
				cliente.getTelefone(),
				cliente.getEndereco());
	}
	
}
