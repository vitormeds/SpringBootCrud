package com.vitormendes.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitormendes.springbootcrud.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {

	
}
