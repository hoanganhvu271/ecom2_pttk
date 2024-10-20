package com.ecom.ecom2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.ecom.ecom2.model.order_model.Order;
import com.ecom.ecom2.services.OrderService;

import java.util.*;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

     @GetMapping("/order/history")
    public String getAllOrders(Model model) {
       List<Order> orders = new ArrayList<Order>();
        orders = orderService.getOrders();
        model.addAttribute("orders", orders);
        return "orders";
    }
}
