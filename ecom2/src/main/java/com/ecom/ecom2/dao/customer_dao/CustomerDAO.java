package com.ecom.ecom2.dao.customer_dao;

import java.util.List;

import com.ecom.ecom2.model.card_model.Card;
import com.ecom.ecom2.model.customer_model.Customer;
import com.ecom.ecom2.model.order_model.Order;

public interface CustomerDAO {
    public void updateProfile(Customer customer);
    public Card viewCard();
    public List<Order> viewOrderHistory();
    public void trackOrder(int orderId);
}

