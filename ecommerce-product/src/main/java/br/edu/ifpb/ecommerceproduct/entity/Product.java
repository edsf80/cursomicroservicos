/**
 * 
 */
package br.edu.ifpb.ecommerceproduct.entity;

import java.io.Serializable;

/**
 * @author edsf
 *
 */
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 948241434877601318L;
	
	private int id;
	
	private String descricao;
	
	private Double valor;
	
	public Product() {
		
	}
	
	public Product(int id, String descricao, Double valor) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}	

}
