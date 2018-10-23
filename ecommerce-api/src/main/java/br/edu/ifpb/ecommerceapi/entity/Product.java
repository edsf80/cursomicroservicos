package br.edu.ifpb.ecommerceapi.entity;

import java.io.Serializable;

public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7433097159734605784L;

	private int id;

	private String description;

	private Double price;

	public Product() {

	}

	public Product(int id, String descricao, Double valor) {
		this.id = id;
		this.description = descricao;
		this.price = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return this.description;
	}

	public void setDescricao(String descricao) {
		this.description = descricao;
	}

	public Double getValor() {
		return this.price;
	}

	public void setValor(Double valor) {
		this.price = valor;
	}
}
