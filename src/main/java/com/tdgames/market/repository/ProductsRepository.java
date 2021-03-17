package com.tdgames.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tdgames.market.entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer>{

}
