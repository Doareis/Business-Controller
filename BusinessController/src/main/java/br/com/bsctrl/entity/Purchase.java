package br.com.bsctrl.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="purchase")
public class Purchase implements Serializable {

	private static final long serialVersionUID = 9150461552538269117L;

	@Id
	@GeneratedValue
	@Column(name="id")
	long id;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	@NotNull
	Product product;
	
	@Column(name="price")
	@NotNull
	double price;
	
	@Column(name="amount")
	@NotNull
	double amount;

	// getters & setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
