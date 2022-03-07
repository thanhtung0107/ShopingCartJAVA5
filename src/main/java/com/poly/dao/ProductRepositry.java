package com.poly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.poly.entity.Product;

@Repository
public interface ProductRepositry extends JpaRepository<Product, Long> {
	
	List<Product> findByNameContainingIgnoreCase(String name);
	// select brand ko trung lap
	@Query("SELECT DISTINCT brand FROM Product")
	List<String> findAllBrandsDistincts();
}
