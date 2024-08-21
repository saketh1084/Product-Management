package com.st.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.st.crud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
