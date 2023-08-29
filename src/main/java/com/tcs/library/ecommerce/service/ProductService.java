package com.tcs.library.ecommerce.service;

import com.tcs.library.ecommerce.model.Product;

public interface ProductService {

	public Product saveProduct(Product product);

	public Product getProduct(Long id);
}
