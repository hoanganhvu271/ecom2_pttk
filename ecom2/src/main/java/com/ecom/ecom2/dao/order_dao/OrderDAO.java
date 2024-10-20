package com.ecom.ecom2.dao.order_dao;

import com.ecom.ecom2.model.order_model.Order;
import com.ecom.ecom2.model.payment_model.Payment;
import com.ecom.ecom2.model.shipment_model.Shipment;
import java.util.List;

public interface OrderDAO {
    public void addNewOrder(Order order);
    public String getOrderStatus(int orderId);
    public void addDiscount(Order order, double discount);
    public void addShipment(Order order, Shipment shipment);
    public void addPayment(Order order, Payment payment);
    public double calculateTotal(Order order);
    public void cancelOrder(int orderId);
    public void returnOrder(int orderId);
    public List<Order> getOrderList();
}
