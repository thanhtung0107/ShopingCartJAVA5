package com.poly.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poly.entity.WishListItem;

@Repository
public interface WishListItemRepository extends JpaRepository<WishListItem,Long> {

}
