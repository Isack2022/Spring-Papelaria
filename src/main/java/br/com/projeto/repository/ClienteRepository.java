package br.com.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
