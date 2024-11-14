package com.ifba.agenda.services;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import com.ifba.agenda.dtos.CategoriaDTO;
import com.ifba.agenda.entities.Categoria;
import com.ifba.agenda.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	private CategoriaRepository categoriaRepository;
	
	public CategoriaService(CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
	}
	
	
	public List<CategoriaDTO> listarCategorias(){
		return this.categoriaRepository.findAll().stream().map(CategoriaDTO::new).toList();
	}
	
	
	public ResponseEntity<CategoriaDTO> salvarCategoria(CategoriaDTO categoriaDTO,UriComponentsBuilder uriBuilder){
		Categoria categoria = new Categoria(categoriaDTO);
		this.categoriaRepository.save(categoria);
		URI uri = uriBuilder.path("/categorias/{id}").buildAndExpand(categoria.getCategoriaId()).toUri();
		return ResponseEntity.created(uri).body(new CategoriaDTO(categoria));
	}
	
	
	public ResponseEntity<CategoriaDTO> atualizarCategoria(CategoriaDTO categoriaDTO, Long id){
		if(this.categoriaRepository.existsById(id)) {
			Categoria categoria = new Categoria(categoriaDTO);
			categoria.setCategoriaId(id);
			this.categoriaRepository.save(categoria);
			return ResponseEntity.ok(new CategoriaDTO(categoria));
		}	
		return ResponseEntity.notFound().build();
	}
	
	
	public ResponseEntity<CategoriaDTO> apagarCategoria(Long id){
		if(this.categoriaRepository.existsById(id)) {
			CategoriaDTO categoriaDTO = new CategoriaDTO(this.categoriaRepository.findById(id).get());
			this.categoriaRepository.deleteById(id);
			return ResponseEntity.ok(categoriaDTO);
		}
		return ResponseEntity.notFound().build();
	}
	
	
}
