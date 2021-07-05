package com.unittesting.demo.unittesting.controllers;

import com.unittesting.demo.unittesting.entities.Item;
import com.unittesting.demo.unittesting.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/dummy-item")
    public Item getDummyItem() {
        return new Item(1, "Testing", 234.54);
    }

    @GetMapping("/dummy-item-from-service")
    public Item getDummyItemFromService() {
        return itemService.getDummyItem();
    }
}
