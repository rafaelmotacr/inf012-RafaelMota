package com.ifba.agenda.entities;

import com.ifba.agenda.dtos.ContatoDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Contato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Define "contatoId" como um valor único do tipo id.
	private Long contatoId;
	
	@Column(nullable = false) // Define que os registros na coluna nome devem ser não nulos.
	private String nome;
	
	@Column(unique = true, nullable = false) // Define que os registros na coluna telefone devem ser não nulos e únicos.
	private String telefone;
	
	@Column(nullable = true) // Define que a coluna email pode receber registros nulos, embora este seja o padrão.
	private String email;
	
	@ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
	private Categoria categoria;
	
	public Contato() {
	}
	
	public Contato(ContatoDTO contatoDTO) {
		this.contatoId = contatoDTO.contatoId();
		this.nome = contatoDTO.nome();
		this.telefone = contatoDTO.telefone();
		this.email = contatoDTO.email();
	//	this.categoria = ;
	}
	
	public Long getContatoId() {
		return contatoId;
	}
	public void setContatoId(Long contatoId) {
		this.contatoId = contatoId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Contato [contatoId=" + contatoId + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email
				+ ", categoria=" + categoria + "]";
	}
	
}
