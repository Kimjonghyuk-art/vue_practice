package com.vueProj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vueProj.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
	

}
