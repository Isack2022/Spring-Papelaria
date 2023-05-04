package br.com.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.domain.ItensPedido;
import br.com.projeto.repository.ItensPedidoRepository;

@RestController
public class ItensPedidoController {
	
	@Autowired
	private ItensPedidoRepository itp;
	
	@GetMapping("/itenspedido/listar")
	public List <ItensPedido> listar(){
		return itp.findAll();
	}
	
	@PostMapping("/itenspedido/cadastrar")
	public String cadastrar(@RequestBody ItensPedido it) {
		String msg ="";
		itp.save(it);
		msg = "Cadastrou";
		return msg;
	}
}
