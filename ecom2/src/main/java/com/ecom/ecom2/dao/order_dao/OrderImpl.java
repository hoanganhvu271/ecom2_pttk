package com.ecom.ecom2.dao.order_dao;

import com.ecom.ecom2.model.order_model.Order;
import com.ecom.ecom2.model.payment_model.Payment;
import com.ecom.ecom2.model.shipment_model.Shipment;
import java.util.List;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class OrderImpl implements OrderDAO{

    private List<Order> order;

    public OrderImpl() {
        this.order = new ArrayList<Order>();
    }

    public void addNewOrder(Order order) {
        this.order.add(order);
    }

    public List<Order> getOrderList() {
        return this.order;
    }

    @Override
    public String getOrderStatus(int orderId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOrderStatus'");
    }

    @Override
    public void addDiscount(Order order, double discount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addDiscount'");
    }

    @Override
    public void addShipment(Order order, Shipment shipment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addShipment'");
    }

    @Override
    public void addPayment(Order order, Payment payment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addPayment'");
    }

    @Override
    public double calculateTotal(Order order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateTotal'");
    }

    @Override
    public void cancelOrder(int orderId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelOrder'");
    }

    @Override
    public void returnOrder(int orderId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnOrder'");
    }
    
}
