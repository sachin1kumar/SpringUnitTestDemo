package com.unittesting.demo.unittesting.services;

import com.unittesting.demo.unittesting.entities.Item;
import com.unittesting.demo.unittesting.repositories.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ItemServiceTest {

    @InjectMocks
    private ItemService itemService;

    @Mock
    private ItemRepository itemRepository;

    @Test
    public void shouldReturnAllItems() {
        when(itemRepository.findAll()).thenReturn(Arrays.asList(new Item(1, "Testing1", 234.54),
                new Item(2, "Testing2", 234.54)));
        List<Item> listOfItems = itemService.retrieveAllItems();
        assertEquals(23454, listOfItems.get(0).getValue(), 2);
        assertEquals(23454, listOfItems.get(1).getValue(), 2);
    }
}
