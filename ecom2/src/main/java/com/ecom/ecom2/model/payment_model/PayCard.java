package com.ecom.ecom2.model.payment_model;

import java.util.Date;

public class PayCard  extends Payment{
    private int cardNumber;
    private String cardInfo;

    public PayCard(int id, String paymentMethod,Date paymentDate, String cardInfo, int cardNumber) {
        super(id, paymentMethod, paymentDate);
        this.cardNumber = cardNumber;
        this.cardInfo = cardInfo;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(String cardInfo) {
        this.cardInfo = cardInfo;
    }

    
}
