package com.ifba.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifba.store.entities.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long>{

}
