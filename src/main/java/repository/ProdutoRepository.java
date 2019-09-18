package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {

	
}
