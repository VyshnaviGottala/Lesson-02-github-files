package com.mindtree.shop.service;

import org.springframework.stereotype.Service;

@Service
public interface CartService {
	void addCart(int productId);
}
