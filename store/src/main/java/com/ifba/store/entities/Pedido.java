package com.ifba.store.entities;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany; 
 
@Entity 
public class Pedido { 
 
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long pedidoId; 
 
    @ManyToOne 
    @JoinColumn(name = "cliente_id") 
    private Cliente cliente; 
 
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL) 
    private List<ItemPedido> itens; 
 
    private BigDecimal valorTotal; 
 
    @Enumerated(EnumType.STRING) 
    private StatusPedido status;

	public Long getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	} 
    
} 