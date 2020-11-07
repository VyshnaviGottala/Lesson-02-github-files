package com.mindtree.shop.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {

	@Id
	private int cartId;

	@OneToMany(cascade=CascadeType.ALL)
	private List<Products> products;

	public Cart() {
		super();
	}

	public Cart(int cartId) {
		this.cartId = cartId;
	}

	public Cart(int cartId, List<Products> products) {
		super();
		this.cartId = cartId;
		this.products = products;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

}
