package com.tdgames.market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdgames.market.entity.Products;
import com.tdgames.market.repository.ProductsRepository;

@Service
public class ProductsService {

	@Autowired
	ProductsRepository productsRepository;
		
	public List<Products> listarProductos(){
		return productsRepository.findAll();
	}
	
	public void guardarProducto(Products products) {
		productsRepository.save(products);
	}
}
