package br.com.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
