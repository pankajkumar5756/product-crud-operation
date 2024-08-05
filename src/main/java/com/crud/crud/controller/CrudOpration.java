package com.crud.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.crud.entity.ProductEntity;
import com.crud.crud.model.ProductModel;
import com.crud.crud.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class CrudOpration {
	
	@Autowired
	private ProductService service;
	
//	@GetMapping("/test")
//	public String test() {
//		log.info("this is test controller");
//		return "SUCCESS";
//	}
	
	@PostMapping("/addpro")
	public String addProduct(@RequestBody ProductModel model) {
		 service.saveProduct(model);
		 return "successfully save your product";
	}
	
}
