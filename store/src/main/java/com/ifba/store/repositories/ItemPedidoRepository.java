package com.ifba.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifba.store.entities.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository <ItemPedido, Long> {

}
