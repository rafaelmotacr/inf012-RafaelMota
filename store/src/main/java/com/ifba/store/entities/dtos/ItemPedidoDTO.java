package com.ifba.store.entities.dtos;

import java.math.BigDecimal;

import com.ifba.store.entities.ItemPedido;
import com.ifba.store.entities.Pedido;
import com.ifba.store.entities.Produto;

public record ItemPedidoDTO (Long itemPedidoId,Produto produto,Pedido pedido, Integer quantidade, BigDecimal precoUnitario){
	
	public ItemPedidoDTO(ItemPedido itemPedido) {
		this(itemPedido.getItemPedidoId(),
				itemPedido.getProduto(),
				itemPedido.getPedido(),
				itemPedido.getQuantidade(),
				itemPedido.getPrecoUnitario());
	}
	
}
