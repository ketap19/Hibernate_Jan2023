package com.jbk.hibernate.utility;

import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.jbk.hibernate.entity.Product;

public class ProductUtility {
	
	public Product prepareProductInfo(int val) {
		String productName = null, productId;
		int supplierId = 0, categoryId = 0, productQTY = 0;
		double productPrice = 0;
		Product product;
		Scanner scanner = new Scanner(System.in);
		if(val==0) {
			
			productId = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
		} else {
			 System.out.println("Enter product Id");
			 productId = scanner.next();
		}
		
		
		try {
		
		    System.out.println("Enter product name");
			 productName = scanner.next();
			
			System.out.println("Enter supplier id");
			 supplierId = scanner.nextInt();
			
			System.out.println("Enter category id");
			 categoryId = scanner.nextInt();
			
			System.out.println("Enter product quantity");
			 productQTY = scanner.nextInt();
			
			System.out.println("Enter product price");
			 productPrice = scanner.nextDouble();
			} catch (InputMismatchException e) {
				return null;
				
			}
		product = new Product(productId, productName, supplierId, categoryId, productQTY, productPrice);
			
		return product;
		
	}
	    public boolean validateProduct(Product product) {
		
		boolean isValidated = true;
		
		try {
			Double.parseDouble(product.getProductName());
			isValidated = false;
		} catch (NumberFormatException e) {
			isValidated = true;
			
		}
		if(product.getSupplierId()<=0 || product.getCategoryId()<=0  || product.getProductQTY()<=0  || product.getProductPrice()<=0) {
			isValidated=false;
		}
		return isValidated;
		
	}
}
