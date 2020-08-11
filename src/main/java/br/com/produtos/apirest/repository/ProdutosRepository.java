package br.com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.produtos.apirest.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

	Produtos findById(long id);
}
