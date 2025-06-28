package com.ederrabelo.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ederrabelo.dscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
