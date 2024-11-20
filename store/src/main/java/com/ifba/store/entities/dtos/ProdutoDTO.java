package com.ifba.store.entities.dtos;

import java.math.BigDecimal;

import com.ifba.store.entities.Produto;

public record ProdutoDTO (String nome,String descricao,BigDecimal preco,Integer quantidadeEstoque){
	
	public ProdutoDTO(Produto produto) {
		this(produto.getNome(),
				produto.getDescricao(),
				produto.getPreco(),
				produto.getQuantidadeEstoque());
	}
}
