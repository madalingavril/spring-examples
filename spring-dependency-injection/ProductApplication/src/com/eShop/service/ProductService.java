package com.eShop.service;

import com.eShop.domain.Product;
import com.eShop.repository.IProductRepository;
import com.eShop.repository.ProductRepository;

public class ProductService implements IProductService{
	private IProductRepository productRepository;

	public ProductService(){
		productRepository = new ProductRepository();
	}

	public void setProductRepository(IProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public Product getProduct(int productNumber) {
		return productRepository.findOne(productNumber);
	}

}

