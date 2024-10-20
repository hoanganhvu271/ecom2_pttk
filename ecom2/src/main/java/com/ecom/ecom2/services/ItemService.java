package com.ecom.ecom2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.ecom2.dao.item_dao.ItemImpl;
import com.ecom.ecom2.model.item_model.Item;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

    @Autowired
    private ItemImpl itemImpl;

    public List<Item> getAllItems() {
        return itemImpl.getAllItems();
    }

    public List<Item> searchName(String query) {
        return itemImpl.getAllItems().stream()
                .filter(item -> item.getName().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }
}
