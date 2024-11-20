package com.ifba.store.entities;
import java.math.BigDecimal;

import com.ifba.store.entities.dtos.ItemPedidoDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity 
public class ItemPedido { 
 
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long itemPedidoId; 
 
    @ManyToOne 
    @JoinColumn(name = "produto_id") 
    private Produto produto; 
 
    @ManyToOne 
    @JoinColumn(name = "pedido_id") 
    private Pedido pedido; 
    private Integer quantidade; 
    private BigDecimal precoUnitario;
    
	public ItemPedido(Long itemPedidoId, Produto produto, Pedido pedido, Integer quantidade, BigDecimal precoUnitario) {
		super();
		this.itemPedidoId = itemPedidoId;
		this.produto = produto;
		this.pedido = pedido;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
	}
	
	public ItemPedido(ItemPedidoDTO itemPedidoDTO) {
		super();
		this.itemPedidoId = itemPedidoDTO.itemPedidoId();
		this.produto = itemPedidoDTO.produto();
		this.pedido = itemPedidoDTO.pedido();
		this.quantidade = itemPedidoDTO.quantidade();
		this.precoUnitario = itemPedidoDTO.precoUnitario();
	}
	
	
	public Long getItemPedidoId() {
		return itemPedidoId;
	}
	public void setItemPedidoId(Long itemPedidoId) {
		this.itemPedidoId = itemPedidoId;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(BigDecimal precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
    
} 