/**
 * 
 */
package br.edu.ifpb.ecommerceproduct.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author edsf
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 948241434877601318L;
	
	private int id;
	
	private String descricao;
	
	private Double valor;

}
