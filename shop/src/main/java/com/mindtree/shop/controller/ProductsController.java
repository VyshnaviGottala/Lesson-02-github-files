package com.mindtree.shop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.shop.entity.Cart;
import com.mindtree.shop.entity.Products;
import com.mindtree.shop.repository.ProductsRepository;
import com.mindtree.shop.service.ProductsService;

@RestController
@RequestMapping("/Products")
public class ProductsController {

	@Autowired
	ProductsService productservice;

	@Autowired
	ProductsRepository productrepo;

	@PostMapping("/addproducts")
	public String add(@PathVariable Cart cart)
	{
		this.productservice.addProducts(cart);
		return "success";
	}
	
	@GetMapping("/get/{productName}")
	Optional<Products> getByproductName(@PathVariable String productName) {
		Optional<Products> product = this.productservice.findByproductName(productName);
		System.out.println(product);
		return product;
	}

	@GetMapping("/get")
	public List<Cart> getAllProducts() {
		List<Cart> allproducts = new ArrayList<>();
		allproducts = this.productservice.getAllProducts();
		System.out.println(allproducts);
		return allproducts;
	}

	@GetMapping("/delete/{productId}")
	public String delById(@PathVariable int productId) {
		this.productservice.deleteByproductId(productId);
		return "success";
	}

	@PostMapping("/delete/{productId}")
	public String delById() {
		return "success";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/delall/{cartId}/{ProductId}")
	public String delAll(@PathVariable int cartId, @PathVariable int productId) {
		productservice.deleteFromCart(cartId, productId);
		System.out.println(cartId);
		System.out.println(productId);
		return "success";
	}
}