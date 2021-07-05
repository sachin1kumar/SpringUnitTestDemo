package com.unittesting.demo.unittesting.services;

import com.unittesting.demo.unittesting.entities.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemService {

    public Item getDummyItem() {
        return new Item(1, "Testing", 234.54);
    }
}
