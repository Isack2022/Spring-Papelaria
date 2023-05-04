package br.com.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
