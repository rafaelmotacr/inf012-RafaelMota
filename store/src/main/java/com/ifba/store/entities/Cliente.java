package com.ifba.store.entities;

import com.ifba.store.entities.dtos.ClienteDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clienteId;
	private String nome;
	private String email;
	private String telefone;
	private Endereco endereco;
	
	public Cliente(Long clienteId, String nome, String email, String telefone, Endereco endereco) {
		super();
		this.clienteId = clienteId;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	public Cliente(ClienteDTO clienteDTO) {
		super();
		this.clienteId = clienteDTO.clienteId();
		this.nome = clienteDTO.nome();
		this.email = clienteDTO.email();
		this.telefone = clienteDTO.telefone();
		this.endereco = clienteDTO.endereco();
	}
	
	public Long getClienteId() {
		return clienteId;
	}
	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
