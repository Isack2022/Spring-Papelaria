package br.com.projeto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer idproduto;
	
	@Column(nullable = false)
	private String nomeproduto;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private String categoria;
	
	@Column(nullable = false)
	private Double preco;

	public Produto() {
	}

	public Produto(Integer idproduto, String nomeproduto, String descricao, String categoria, Double preco) {
		super();
		this.idproduto = idproduto;
		this.nomeproduto = nomeproduto;
		this.descricao = descricao;
		this.categoria = categoria;
		this.preco = preco;
	}

	public Integer getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(Integer idproduto) {
		this.idproduto = idproduto;
	}

	public String getNomeproduto() {
		return nomeproduto;
	}

	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	
	
}
