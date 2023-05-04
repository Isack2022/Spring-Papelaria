package br.com.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.domain.Produto;
import br.com.projeto.repository.ProdutoRepository;

@RestController
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository prod;
	
	@GetMapping("/produto/listar")
	public List <Produto> listar(){
		return prod.findAll();
	}
	
	@PostMapping("/produto/cadastrar")
	public String cadastrar(@RequestBody Produto pro) {
		String msg ="";
		prod.save(pro);
		msg = "Cadastrou";
		return msg;
	}
}
