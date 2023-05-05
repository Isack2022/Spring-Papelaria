package br.com.projeto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcessoControler {
	
	@GetMapping("/acesso/msg")
	public String msg() {
		return "Olá, você está no ambiente";
	}
	
	@GetMapping("/acesso/listar")
	public List<String> lista(){
		List<String> lst = new ArrayList<String>();
		lst.add("Mouse");
		lst.add("Tv");
		lst.add("Papel");
		return lst;
	}
}
