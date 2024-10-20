package com.ecom.ecom2.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.ecom2.dao.card_dao.CardImpl;
import com.ecom.ecom2.dao.item_dao.ItemImpl;
import com.ecom.ecom2.dao.order_dao.OrderImpl;
import com.ecom.ecom2.model.card_model.Card;
import com.ecom.ecom2.model.customer_model.Customer;
import com.ecom.ecom2.model.item_model.Item;
import com.ecom.ecom2.model.order_model.Order;
import com.ecom.ecom2.model.payment_model.PayCard;
import com.ecom.ecom2.model.payment_model.PayCash;
import com.ecom.ecom2.model.payment_model.Payment;
import com.ecom.ecom2.model.shipment_model.Shipment;

@Service
public class CardService {

    @Autowired
    private CardImpl cardImpl;

    @Autowired
    private ItemImpl itemImpl;

    @Autowired
    private OrderImpl orderImpl;


    public int addItemToCart(int id) {
        Item item = itemImpl.getItemById(id);
        cardImpl.addItemToCard(item);
        return cardImpl.getItemCount();
    }

    public Card getCard() {
        return cardImpl.getCard();
    }
    public Customer getCustomer() {
        return cardImpl.getCard().getCustomer();
    }

    public void successPayment(String paymentMethod){
        Payment payment ;

        if (paymentMethod.equals("creditCard")) {
            payment = new PayCard(0, paymentMethod, new Date(), "cardInfo", 0);
        } else {
            payment = new PayCash(0, paymentMethod, new Date(), "0");
        }
        

        Card card = cardImpl.getCard();

        Shipment shipment = new Shipment(0, 1, paymentMethod, card.getTotalPrice());

        Order order = new Order(0, getCard(), payment, shipment, 0, card.getTotalPrice(), new Date());

        orderImpl.addNewOrder(order);
        cardImpl.deleteAllItems();
    }
}
