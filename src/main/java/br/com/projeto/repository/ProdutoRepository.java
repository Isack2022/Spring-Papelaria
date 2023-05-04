package br.com.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
