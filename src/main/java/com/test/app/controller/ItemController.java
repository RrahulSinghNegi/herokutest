package com.test.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
	List<String> itemList = new ArrayList<String>();
	
	@CrossOrigin
	@GetMapping("/addItem")
	public void addItem() {
		System.out.println("Helloooooo");
		itemList.add("apple");
		itemList.add("orange");
		itemList.add("grapes");
	}
	
	@CrossOrigin
	@GetMapping("/showItem")
	public List<String> showItem() {
		return itemList;
	}
}
