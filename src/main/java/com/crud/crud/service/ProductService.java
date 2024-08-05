package com.crud.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.crud.entity.ProductEntity;
import com.crud.crud.model.ProductModel;
import com.crud.crud.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo repo;
	
	public ProductEntity saveProduct(ProductModel model) {
		
		ProductEntity entity = new ProductEntity();
		entity.setName(model.getName());
		entity.setPrice(model.getPrice());
		entity.setQuantity(model.getQuantity());
		
		return repo.save(entity);
	}

}
