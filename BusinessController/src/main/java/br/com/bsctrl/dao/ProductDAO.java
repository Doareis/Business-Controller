package br.com.bsctrl.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.bsctrl.entity.Product;

@Repository
public class ProductDAO extends BaseDAO{

	@SuppressWarnings("unchecked")
	public List<Product> getAll() {
		return (List<Product>) super.getAll(Product.class);
	}

}
