package com.jbk.hibernate.service;

import com.jbk.hibernate.dao.ProductDao;
import com.jbk.hibernate.entity.Product;

public class ProductService {
	
	ProductDao dao = new ProductDao();

	public boolean saveProduct(Product product) {
		
		boolean isAdded = dao.saveProduct(product);
		return isAdded;
		
	}
	public Product getProduct(String productId) {
		Product product	= dao.getProduct(productId);
		return product;
	}
	public boolean deleteProduct(String productId) {
		
	boolean isDeleted =	dao.deleteProduct(productId);
		return isDeleted;
		
	}
	public int updateProduct(Product product) {
		
	int isUpdated = dao.updateProduct(product);
		
	return isUpdated;
		
	}
}
