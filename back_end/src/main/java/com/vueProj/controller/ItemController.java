package com.vueProj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vueProj.entity.Item;
import com.vueProj.repository.ItemRepository;

@RestController
public class ItemController {
	
	@Autowired
	ItemRepository itemRepository;

	@GetMapping("/api/items")
	
	public List<Item> getItems() {
		List<Item> items = itemRepository.findAll();
		
		return items;
	}
	
}
