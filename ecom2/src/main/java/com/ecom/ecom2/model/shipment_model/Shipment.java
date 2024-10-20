package com.ecom.ecom2.model.shipment_model;

public class Shipment {
    private int id;
    private int amount;
    private String method;
    private double cost;

    public Shipment(int id, int amount, String method, double cost) {
        this.id = id;
        this.amount = amount;
        this.method = method;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    
}
