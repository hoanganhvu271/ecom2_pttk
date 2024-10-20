package com.ecom.ecom2.model.payment_model;

import java.util.Date;

public class PayCash extends Payment{

    private String currencyCode;
    public PayCash(int id, String paymentMethod, Date paymentDate, String currencyCode) {
        super(id, paymentMethod, paymentDate);
        this.currencyCode = currencyCode;
    }
    public String getCurrencyCode() {
        return currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    
}
