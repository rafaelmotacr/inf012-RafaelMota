package com.ifba.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifba.store.entities.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long>{

}
