package com.mindtree.shop.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.mindtree.shop.repository.CartRepository;
import com.mindtree.shop.service.CartService;

public class CartServiceImpl implements CartService {
	@Autowired
	CartRepository cartrepository;

	@Override
	public void addCart(int productId) {

		cartrepository.save(productId);

	}

}
