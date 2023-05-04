package br.com.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.domain.Categoria;
import br.com.projeto.repository.CategoriaRepository;

@RestController
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository ca;
	
	@GetMapping("/categoria/listar")
	public List <Categoria> listar(){
		return ca.findAll();
	}
	
	@PostMapping("/categoria/cadastrar")
	public String cadastrar(@RequestBody Categoria cat) {
		String msg ="";
		ca.save(cat);
		msg = "Cadastrou";
		return msg;
	}
	
}
