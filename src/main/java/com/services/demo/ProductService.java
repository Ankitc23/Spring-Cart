package com.services.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.models.demo.Product;

@Service
public class ProductService {
	
		public List<Product> getAllProducts() {
			
				List<Product> listOfProducts = new ArrayList<>();
				listOfProducts.add(new Product("123", "FOOD", "This is Awesome Iphone", 400.4, "Apple Inc"));
				listOfProducts.add(new Product("124", "Samsung Y", "This is Awesome Samsung ", 300.4, "Samsung Inc"));
				listOfProducts.add(new Product("125", "LG Z", "This is Awesome LG ", 200.4, "LG Inc"));
				
				return listOfProducts;
		}
		
		public Product getProductById(String Id) {
			
				Predicate<Product> byId = p -> p.getId().equals(Id);
				return filterProducts(byId);
		}
		
		public Product filterProducts(Predicate<Product> strategy) {
			return getAllProducts().stream().filter(strategy).findFirst().orElse(null);
		}
}
