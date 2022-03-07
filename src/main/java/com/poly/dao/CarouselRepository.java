package com.poly.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.entity.Carousel;

public interface CarouselRepository extends JpaRepository<Carousel, Long> {

}
