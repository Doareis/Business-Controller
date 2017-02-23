package br.com.bsctrl.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="product")
public class Product implements Serializable{

	private static final long serialVersionUID = -3702273747735797082L;

	@Id
	@GeneratedValue
	@Column(name="id")
	int id;
	
	@Column(name="nome")
	@NotNull
	String nome;
	
	
	// getters & setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
