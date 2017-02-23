package br.com.bsctrl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.bsctrl.dao.ProductDAO;
import br.com.bsctrl.entity.Product;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductDAO dao;

	@RequestMapping("/list")
	public ModelAndView getList(){
		
		List<Product> list = (List<Product>) dao.getAll();
		ModelAndView model = new ModelAndView("product/list");
		model.addObject("productList", list);
		
		return model;
	}
}
