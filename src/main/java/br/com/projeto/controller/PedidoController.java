package br.com.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.domain.Pedido;
import br.com.projeto.repository.PedidoRepository;

@RestController
public class PedidoController {
	
	@Autowired
	private PedidoRepository pe;
	
	@GetMapping("/pedido/listar")
	public List <Pedido> listar(){
		return pe.findAll();
	}
	
	@PostMapping("/pedido/cadastrar")
	public String cadastrar(@RequestBody Pedido ped) {
		String msg ="";
		pe.save(ped);
		msg = "Cadastrou";
		return msg;
	}
}
