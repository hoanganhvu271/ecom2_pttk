package com.ecom.ecom2.model.rate_model;

import com.ecom.ecom2.model.customer_model.Customer;

public class Rate {
    private Customer customer;
    private double rate;
    private String rateText;
    public Rate(Customer customer, double rate, String rateText) {
        this.customer = customer;
        this.rate = rate;
        this.rateText = rateText;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public String getRateText() {
        return rateText;
    }
    public void setRateText(String rateText) {
        this.rateText = rateText;
    }

    
}
