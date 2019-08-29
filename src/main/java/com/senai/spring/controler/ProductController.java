package com.senai.spring.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.senai.spring.dao.ProductDAO;
import com.senai.spring.model.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductDAO service;

	@RequestMapping("/")
	public String HomePage(Model model) {
		List<Product> listProducts = service.listaAll();
		model.addAttribute("listProducts", listProducts);
		return "index";
	}

	@RequestMapping("/cadastro")
	public String NewProducts(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);

		return "cadastro";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable(name = "id") int id) {
		ModelAndView modelAndView = new ModelAndView("cadastro");
		Product product = service.getId(id);
		modelAndView.addObject("product", product);
		return modelAndView;
	}

	@PostMapping(value = "/save")
	public String saveProduct(Product produto, Model model) {
		service.save(produto);
		return "redirect:/";
	}

	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";
	}
}