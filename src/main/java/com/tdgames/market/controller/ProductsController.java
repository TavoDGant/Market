package com.tdgames.market.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tdgames.market.entity.Products;
import com.tdgames.market.service.ProductsService;

@RestController
public class ProductsController {

	@Autowired
	ProductsService productsService;
	
	@GetMapping("/")
	public String hola() {
		return "Hola";
	}
	
	@GetMapping("/allProducts")
	public List<Products> mostrarTodo(){
		return productsService.listarProductos();
	}
	
	@PostMapping("/addProducts")
	public void addProducts(@RequestBody Products products) {
		productsService.guardarProducto(products);
	}
}
