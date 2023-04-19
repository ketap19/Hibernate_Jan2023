package com.jbk.hibernate.controller;

import java.util.Scanner;

import com.jbk.hibernate.entity.Product;
import com.jbk.hibernate.service.ProductService;
import com.jbk.hibernate.utility.ProductUtility;

public class ProductController {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		char ch;
		ProductService service = new ProductService();
		ProductUtility utility = new ProductUtility();
		do {
			System.out.println("Press 1 for save product");
			System.out.println("Press 2 for get product");
			System.out.println("Press 3 for delete product");
			System.out.println("Press 4 for update product");
			
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1:{				
				Product product = utility.prepareProductInfo(0);
				if(product!=null) {
				boolean isValidated = utility.validateProduct(product);
			if (isValidated) {
				boolean isAdded = service.saveProduct(product);
				if (isAdded) {
					System.out.println("saved !!");
				}else 
				{
					System.out.println("product already exist with id="+product.getProductId()+"and Name="+product.getProductName());
				}
			} else {
				System.out.println("Incorrect Data !!");
			} 
				} else {
					System.out.println("Input Mismatch");
				}
				break;
			}
			case 2:{
				System.out.println("Enter product Id");
				String productId = scanner.next();
				
				Product product = service.getProduct(productId);
				if (product!=null) {
					System.out.println(product);
				} else {
					System.out.println("Product not exist with ID ="+productId);
				}
				break;
			}
			case 3:{
				System.out.println("Enter product Id");
				String productId = scanner.next();
				boolean isDeleted = service.deleteProduct(productId);
				if(isDeleted) {
					System.out.println("Product deleted");
				} else {
					System.out.println("Product not exist with ID ="+productId);
				}
				break;
			}
			case 4:{
				Product product = utility.prepareProductInfo(1);
				int isUpdated = service.updateProduct(product);
				if(isUpdated==1) {
					System.out.println("Updated !!");
				} else if(isUpdated==2) {
					System.out.println("Already existed with name="+product.getProductName());
				} else if(isUpdated==3) {
					System.out.println("Product not exist with ID ="+product.getProductId());
				}
				break;
			}
			default:
				break;
			}
			System.out.println("Do you want to continue y/n");
			ch = scanner.next().charAt(0);
	} while (ch == 'y' || ch == 'Y');
		System.out.println("App terminated");
	}
}
	