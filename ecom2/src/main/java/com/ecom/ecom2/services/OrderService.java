package com.ecom.ecom2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.ecom2.dao.order_dao.OrderImpl;
import com.ecom.ecom2.model.order_model.Order;
import java.util.List;

@Service
public class OrderService {
    
    @Autowired
    private OrderImpl orderImpl;

    public List<Order> getOrders() {
        return orderImpl.getOrderList();
    }
}
