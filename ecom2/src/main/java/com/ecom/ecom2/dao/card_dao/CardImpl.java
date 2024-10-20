package com.ecom.ecom2.dao.card_dao;

import java.util.List;
import java.util.ArrayList;
import com.ecom.ecom2.model.card_model.Card;
import com.ecom.ecom2.model.customer_model.Customer;
import com.ecom.ecom2.model.item_model.Item;
import org.springframework.stereotype.Repository;

@Repository
public class CardImpl implements CardDAO{

    private Card card;

    public CardImpl() {
        List<Item> itemList = new ArrayList<>();
        this.card = new Card(0, new Customer(0, "vu", "hoanganhvu271103@gmail.com", "+84 382519718", "Nguyen Van Troi, Mo Lao, Ha Dong, Ha Noi"), itemList, 0, 0);
    }


    @Override
    public void addItemToCard(Item item) {
        this.card.getItemList().add(item);
    }

    @Override
    public void updateQtyItem(Item item, int quantity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateQtyItem'");
    }

    @Override
    public void deleteItem(Item item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteItem'");
    }

    @Override
    public List<Item> getAllItems() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllItems'");
    }

    @Override
    public void checkout() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkout'");
    }


    @Override
    public int getItemCount() {
        return this.card.getItemList().size();
    }


    @Override
    public Card getCard() {
        return this.card;
    }

    public void deleteAllItems() {
        this.card.getItemList().clear();
    }


}
