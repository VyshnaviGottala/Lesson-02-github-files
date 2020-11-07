package com.mindtree.shop.repository;

//import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.shop.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

	void save(int productId);
}