package com.categoryProduct.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.categoryProduct.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Serializable> {

	public Product findById(Integer Id);

}
