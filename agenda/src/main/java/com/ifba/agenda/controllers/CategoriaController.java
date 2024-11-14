package com.ifba.agenda.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ifba.agenda.dtos.CategoriaDTO;
import com.ifba.agenda.services.CategoriaService;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

	private CategoriaService categoriaService;
	
	public CategoriaController(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}
	
	
	@GetMapping
	public List<CategoriaDTO> ListarCategoria(){
         return this.categoriaService.listarCategorias();
    }
	
	
	@PostMapping
	public ResponseEntity<CategoriaDTO> salvarCategoria(@RequestBody CategoriaDTO categoriaDTO, UriComponentsBuilder  uriBuilder) {
		return categoriaService.salvarCategoria(categoriaDTO, uriBuilder);
	}

	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<CategoriaDTO> atualizarCategoria(@RequestBody CategoriaDTO categoriaDTO, @PathVariable Long id) {
		return categoriaService.atualizarCategoria(categoriaDTO, id);
	}
	

	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<CategoriaDTO> apagarCategoria(@PathVariable Long id) {
		return this.categoriaService.apagarCategoria(id);
	}
	
	
}
