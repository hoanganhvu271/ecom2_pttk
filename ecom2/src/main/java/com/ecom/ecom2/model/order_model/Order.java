package com.ecom.ecom2.model.order_model;

import java.util.Date;

import com.ecom.ecom2.model.card_model.Card;
import com.ecom.ecom2.model.shipment_model.Shipment;
import com.ecom.ecom2.model.payment_model.Payment;

public class Order {
    private int id;
    private Card card;
    private Payment payment;
    private Shipment shipment;
    private double discount;
    private double grandTotal;
    private Date orderDate;

    public Order(int id, Card card, Payment payment, Shipment shipment, double discount, double grandTotal,
            Date orderDate) {
        this.id = id;
        this.card = card;
        this.payment = payment;
        this.shipment = shipment;
        this.discount = discount;
        this.grandTotal = grandTotal;
        this.orderDate = orderDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    
}
