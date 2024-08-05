package com.crud.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.crud.entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

}
