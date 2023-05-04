package br.com.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.domain.Cliente;
import br.com.projeto.repository.ClienteRepository;

@RestController
public class ClienteController {
	
	@Autowired
	private ClienteRepository cl;
	
	@GetMapping("/cliente/listar")
	public List <Cliente> listar(){
		return cl.findAll();
	}
	
	@PostMapping("/cliente/cadastrar")
	public String cadastrar(@RequestBody Cliente cli) {
		String msg = "";
		cl.save(cli);
		msg = "Cadastrou";
		return msg;
	}
}
