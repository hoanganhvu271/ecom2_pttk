package com.ecom.ecom2.dao.payment_dao;

import com.ecom.ecom2.model.payment_model.Payment;

public interface PaymentDAO {
    public void calculatePayment( Payment payment);
    public void createPayment( Payment payment);
    public void updatePayment( Payment payment);
    public void deletePayment( Payment payment);
}
