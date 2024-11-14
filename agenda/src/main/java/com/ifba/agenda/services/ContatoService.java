package com.ifba.agenda.services;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import com.ifba.agenda.dtos.ContatoDTO;
import com.ifba.agenda.entities.Contato;
import com.ifba.agenda.repositories.ContatoRepository;

@Service
public class ContatoService {
	
	private ContatoRepository contatoRepository;
	
	public ContatoService(ContatoRepository contatoRepository) {
		this.contatoRepository = contatoRepository;
	}

	
	public List<ContatoDTO> listarContatos(){
		return this.contatoRepository.findAll().stream().map(ContatoDTO::new).toList();
	}
	
	
	public ResponseEntity<ContatoDTO> salvarContato(ContatoDTO contatoDTO, UriComponentsBuilder uriBuilder){
		Contato contato = new Contato(contatoDTO);
		this.contatoRepository.save(contato);
		URI uri = uriBuilder.path("/contatos/{id}").buildAndExpand(contato.getContatoId()).toUri();
		return ResponseEntity.created(uri).body(new ContatoDTO(contato));
	}
	
	
	public ResponseEntity<ContatoDTO> atualizarContato(ContatoDTO contatoDTO, Long id){
		if(this.contatoRepository.existsById(id)) {
			Contato contato = new Contato(contatoDTO);
			contato.setContatoId(id);
			this.contatoRepository.save(contato);
			return ResponseEntity.ok(new ContatoDTO(contato));
		}	
		return ResponseEntity.notFound().build();
	}
	
	
	public ResponseEntity<ContatoDTO> apagarContato(Long id){
		if(this.contatoRepository.existsById(id)) {
			ContatoDTO contatoDTO = new ContatoDTO(this.contatoRepository.findById(id).get());
			this.contatoRepository.deleteById(id);
			return ResponseEntity.ok(contatoDTO);
		}
		return ResponseEntity.notFound().build();
	}
	

}
