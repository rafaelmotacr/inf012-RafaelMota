package com.ifba.store.entities.dtos;

import java.math.BigDecimal;
import java.util.List;

import com.ifba.store.entities.Cliente;
import com.ifba.store.entities.ItemPedido;
import com.ifba.store.entities.Pedido;
import com.ifba.store.entities.StatusPedido;

public class PedidoDTO {

    private Long pedidoId; 
    private Cliente cliente; 
    private List<ItemPedido> itens; 
    private BigDecimal valorTotal; 
    private StatusPedido status;

    public PedidoDTO(Pedido pedido, List<ItemPedido> itens) {
        this.pedidoId = pedido.getPedidoId();
        this.cliente = pedido.getCliente();
        this.itens = itens;
        this.valorTotal = pedido.getValorTotal();
        this.status = pedido.getStatus();
    }

    // Getters e Setters

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
