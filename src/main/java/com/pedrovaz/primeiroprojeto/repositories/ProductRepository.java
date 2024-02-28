package com.pedrovaz.primeiroprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrovaz.primeiroprojeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
