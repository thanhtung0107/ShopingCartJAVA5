package com.poly.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poly.entity.ShoppingCart;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
	ShoppingCart findBySessionToken(String sessionToken);

}
