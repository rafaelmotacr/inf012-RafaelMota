package com.ifba.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifba.store.entities.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long>{

}
