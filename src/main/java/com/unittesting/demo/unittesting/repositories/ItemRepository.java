package com.unittesting.demo.unittesting.repositories;

import com.unittesting.demo.unittesting.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
