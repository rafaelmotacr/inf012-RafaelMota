package com.ifba.agenda.entities;

import java.util.ArrayList;
import java.util.List;

import com.ifba.agenda.dtos.CategoriaDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity //Explicita que a classe representa uma entidade no banco de dados. 
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Define "categoriaId" como um valor único do tipo id.
	private Long categoriaId;
	
	@Column(unique = true, nullable = false) // Define que os registros na coluna nome devem ser não nulos e únicos.
	private String nome;
	
	@OneToMany(mappedBy = "categoria")
	private List<Contato> contatos = new ArrayList<Contato>();
	
	public Categoria() {
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
	public List<Contato> getContatos() {
		return contatos;
	}
	public void setContatos(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}
	
}
