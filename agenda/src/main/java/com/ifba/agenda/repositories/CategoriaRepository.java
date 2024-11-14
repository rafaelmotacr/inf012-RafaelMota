package com.ifba.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifba.agenda.entities.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long>{

}
