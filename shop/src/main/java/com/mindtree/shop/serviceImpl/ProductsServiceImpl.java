package com.mindtree.shop.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.shop.entity.Cart;
import com.mindtree.shop.entity.Products;
import com.mindtree.shop.repository.CartRepository;
import com.mindtree.shop.repository.ProductsRepository;
import com.mindtree.shop.service.ProductsService;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	CartRepository cartrepository;

	@Autowired
	ProductsRepository productsRepository;

	@Override
	public Optional<Products> findByproductName(String productName) {
		Optional<Products> product = productsRepository.findByproductName(productName);
		return product;
	}

	@Override
	public void deleteByproductId(int productId) {
		productsRepository.deleteById(productId);
	}

	@Override
	public void deleteFromCart(int cartId,int productId) {
		Optional<Cart> cart=cartrepository.findById(cartId);
		List<Products> pro=cart.get().getProducts();
		for(int i=0;i<pro.size();i++)
		{
			pro.remove(i);
			
		}
		/*
		 * System.out.println(cart); Cart obj = new Cart(); obj.setCartId(cartId);
		 * cartrepository.delete(obj); System.out.println(obj);
		 */
		}
	

	@Override
	public List<Cart> getAllProducts() {
		return cartrepository.findAll();
	}

	@Override
	public void addProducts(Cart cart) {
		cartrepository.save(cart);
	}

}