package com.ecom.ecom2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.Map;
import java.util.HashMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecom.ecom2.model.card_model.Card;
import com.ecom.ecom2.model.customer_model.Customer;
import com.ecom.ecom2.model.item_model.Item;
import com.ecom.ecom2.services.CardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CardController {

    @Autowired
    private CardService cardService;


    @PostMapping("/cart/add/{id}")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> addToCart(@PathVariable("id") int id) {
        int cartItemCount = cardService.addItemToCart(id); 
        Map<String, Object> response = new HashMap<>();
        response.put("cartItemCount", cartItemCount); 

        return ResponseEntity.ok(response);
    }

    @GetMapping("/cart")
    public String getCart(Model model) {
        Card card = cardService.getCard(); 
        model.addAttribute("itemsInCart", card.getItemList()); 
        int totalPrice = 0;
        for(Item item : card.getItemList()){
            totalPrice += item.getPrice();
        }
        card.setTotalPrice(totalPrice);
        model.addAttribute("totalPrice", totalPrice); 
        return "carts"; 
    }

    @GetMapping("/checkout")
public String checkoutPage(Model model) {
    Card card = cardService.getCard(); 

    Customer currentUser = cardService.getCustomer();

    int totalPrice = 0;
        for(Item item : card.getItemList()){
            totalPrice += item.getPrice();
        }

    card.setTotalPrice(totalPrice);

    model.addAttribute("itemsInCart", card.getItemList());
    model.addAttribute("totalPrice", totalPrice);
    model.addAttribute("user", currentUser); 

    return "checkout";
}

    @GetMapping("/success")
    public String successPayment(Model model) {
        return "success"; 
    }

    @PostMapping("/success")
    public String handlePayment(
            @RequestParam("paymentMethod") String paymentMethod, 
            Model model) {

        cardService.successPayment(paymentMethod);

        if ("creditCard".equals(paymentMethod)) {
            model.addAttribute("message", "Bạn đã chọn thanh toán bằng thẻ.");
        } else if ("cashOnDelivery".equals(paymentMethod)) {
            model.addAttribute("message", "Bạn đã chọn thanh toán khi nhận hàng.");
        }
        model.addAttribute("paymentMethod", paymentMethod);
        
        return "success"; // Tên file HTML để hiển thị kết quả thanh toán
    }

    

}
