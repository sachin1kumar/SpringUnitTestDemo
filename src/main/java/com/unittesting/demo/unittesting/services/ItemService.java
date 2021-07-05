package com.unittesting.demo.unittesting.services;

import com.unittesting.demo.unittesting.entities.Item;
import com.unittesting.demo.unittesting.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Item getDummyItem() {
        return new Item(1, "Testing", 234.54);
    }

    public List<Item> retrieveAllItems() {
        List<Item> items = itemRepository.findAll();
        for (Item item: items) {
            item.setValue(item.getPrice() * 100);
        }
        return items;
    }
}
