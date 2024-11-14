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

import com.ifba.agenda.dtos.ContatoDTO;
import com.ifba.agenda.services.ContatoService;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

	private ContatoService contatoService;
	
	public ContatoController(ContatoService contatoService) {
		this.contatoService = contatoService;
	}
	
	
	@GetMapping
	public List<ContatoDTO> ListarCategoria(){
         return this.contatoService.listarContatos();
    }
	
	
	@PostMapping
	public ResponseEntity<ContatoDTO> salvarCategoria(@RequestBody ContatoDTO contatoDTO, UriComponentsBuilder  uriBuilder) {
		return contatoService.salvarContato(contatoDTO, uriBuilder);
	}

	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<ContatoDTO> atualizarCategoria(@RequestBody ContatoDTO contatoDTO, @PathVariable Long id) {
		return contatoService.atualizarContato(contatoDTO, id);
	}
	

	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<ContatoDTO> apagarCategoria(@PathVariable Long id) {
		return this.contatoService.apagarContato(id);
	}
	
	
}
