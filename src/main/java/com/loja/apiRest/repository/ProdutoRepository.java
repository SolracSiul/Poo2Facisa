package com.loja.apiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.apiRest.models.Produtos;

public interface ProdutoRepository extends JpaRepository<Produtos, Long> {
	
	Produtos findById(long id);

}
