package com.ecom.ecom2.model.payment_model;

import java.util.Date;

public abstract class Payment {
    private int id;
    private String paymentMethod;
    private Date paymentDate;
    
    public Payment(int id, String paymentMethod, Date paymentDate) {
        this.id = id;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    


}
