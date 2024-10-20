// ItemController.java
package com.ecom.ecom2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecom.ecom2.model.item_model.Item;
import com.ecom.ecom2.services.ItemService;

import java.util.List;

@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public String getAllItems(Model model) {
        List<Item> items = itemService.getAllItems();
        model.addAttribute("items", items);
        return "items";
    }

    @GetMapping("/search")
    public String searchItems(@RequestParam("query") String query, Model model) {
        List<Item> items = itemService.searchName(query);
        model.addAttribute("items", items);
        model.addAttribute("query", query);
        return "items"; // Trả về trang items với danh sách tìm kiếm
    }
}
