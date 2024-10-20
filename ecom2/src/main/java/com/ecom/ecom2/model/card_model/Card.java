package com.ecom.ecom2.model.card_model;

import java.util.List;

import com.ecom.ecom2.model.customer_model.Customer;
import com.ecom.ecom2.model.item_model.Item;

public class Card {
    private int id;
    private Customer customer;
    private List<Item> itemList;
    private int totalQuantity;
    private double totalPrice;

    public Card(int id, Customer customer, List<Item> itemList, int totalQuantity, double totalPrice) {
        this.id = id;
        this.customer = customer;
        this.itemList = itemList;
        this.totalQuantity = totalQuantity;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


    
}
