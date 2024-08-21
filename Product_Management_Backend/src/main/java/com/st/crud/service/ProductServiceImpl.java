package com.st.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.crud.model.Product;
import com.st.crud.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepo;

	@Override
	public Product saveProduct(Product product) {
		
		return productRepo.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		
		return productRepo.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
	
		return productRepo.findById(id).get();
	}

	@Override
	public void deleteProduct(Integer id) {
	    Product product = productRepo.findById(id).orElse(null);
	    if (product != null) {
	        productRepo.delete(product); 
	    }
	    
	}

	@Override
	public Product editProduct(Product p, Integer id) {
		Product oldProduct = productRepo.findById(id).get();
		oldProduct.setProductName(p.getProductName());
		oldProduct.setDescription(p.getDescription());
		oldProduct.setPrice(p.getPrice());
		oldProduct.setStatus(p.getStatus());
		
				return productRepo.save(oldProduct);
	}
}
