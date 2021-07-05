package com.unittesting.demo.unittesting.repositories;

import com.unittesting.demo.unittesting.entities.Item;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void shouldReturnAllDataFromDB() {
        List<Item> listOfItems = itemRepository.findAll();
        assertEquals(5, listOfItems.size());
    }
}
