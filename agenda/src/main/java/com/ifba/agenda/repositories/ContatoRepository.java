package com.ifba.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifba.agenda.entities.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
