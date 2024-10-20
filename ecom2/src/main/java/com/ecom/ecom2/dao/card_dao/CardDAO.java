package com.ecom.ecom2.dao.card_dao;

import java.util.List;

import com.ecom.ecom2.model.card_model.Card;
import com.ecom.ecom2.model.item_model.Item;

/**
 * CardDAO
 */
public interface CardDAO {
    public void addItemToCard(Item item);
    public void updateQtyItem(Item item, int quantity);
    public void deleteItem(Item item);
    public List<Item> getAllItems();
    public void checkout();
    public int getItemCount();
    public Card getCard();
    public void deleteAllItems();
}