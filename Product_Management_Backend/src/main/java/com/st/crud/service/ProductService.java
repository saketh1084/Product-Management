package com.st.crud.service;

import java.util.List;

import com.st.crud.model.Product;

public interface ProductService {

	public Product saveProduct(Product product);
	public List<Product> getAllProduct();
	public Product getProductById(Integer id);
	public void deleteProduct(Integer id);
	
	public Product editProduct(Product product,Integer id);
}
