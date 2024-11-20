package com.ifba.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifba.store.entities.Pedido;

public interface PedidoRepository extends JpaRepository <Pedido, Long>{

}
