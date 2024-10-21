// ItemController.java
package com.ecom.ecom2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ecom.ecom2.model.comment_model.Comment;
import com.ecom.ecom2.model.customer_model.Customer;
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

   @GetMapping("/items/details/{id}")
    public String getItem(@PathVariable("id") int id, Model model) {
        Item item = itemService.getItemById(id);
        model.addAttribute("item", item);
        return "detail";
    }

    @GetMapping("/search")
    public String searchItems(@RequestParam("query") String query, Model model) {
        List<Item> items = itemService.searchName(query);
        model.addAttribute("items", items);
        model.addAttribute("query", query);
        return "items"; // Trả về trang items với danh sách tìm kiếm
    }

    @PostMapping("/items/{id}/comments")
    public String addComment(@PathVariable("id") int itemId,
                             @RequestParam("commentText") String commentText,
                             Model model) {
        // Tạo đối tượng bình luận mới
        Comment newComment = new Comment(new Customer(0, "vu", "hoanganhvu271103@gmail.com", "+84 382519718", "Nguyen Van Troi, Mo Lao, Ha Dong, Ha Noi"), commentText);
 
      
        itemService.addCommentToItem(itemId, newComment);

        Item item = itemService.getItemById(itemId);
        model.addAttribute("item", item);

    
        return "detail";
    }
}
