package com.jbk.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jan_product")
public class Product {
	@Id
	@Column(unique = true,nullable = false)
private String productId;
	@Column(unique = true,nullable = false)
private String productName;
	@Column(nullable = false)
private int supplierId;
	@Column(nullable = false)
private int categoryId;
	@Column(nullable = false)
private int productQTY;
	@Column(nullable = false)
private double productPrice;
public Product() {
	
}
public Product(String productId, String productName, int supplierId, int categoryId, int productQTY,
		double productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.supplierId = supplierId;
	this.categoryId = categoryId;
	this.productQTY = productQTY;
	this.productPrice = productPrice;
}
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getSupplierId() {
	return supplierId;
}
public void setSupplierId(int supplierId) {
	this.supplierId = supplierId;
}
public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}
public int getProductQTY() {
	return productQTY;
}
public void setProductQTY(int productQTY) {
	this.productQTY = productQTY;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", supplierId=" + supplierId
			+ ", categoryId=" + categoryId + ", productQTY=" + productQTY + ", productPrice=" + productPrice + "]";
}	
	
}
