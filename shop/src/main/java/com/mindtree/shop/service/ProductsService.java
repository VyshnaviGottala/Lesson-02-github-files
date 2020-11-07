package com.mindtree.shop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mindtree.shop.entity.Cart;
import com.mindtree.shop.entity.Products;

@Service
public interface ProductsService {

	Optional<Products> findByproductName(String productName);

	void deleteByproductId(int productId);

	void deleteFromCart(int cartId,int productId);

	List<Cart> getAllProducts();

	void addProducts(Cart cart);

}
