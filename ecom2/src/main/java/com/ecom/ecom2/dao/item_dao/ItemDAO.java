package com.ecom.ecom2.dao.item_dao;

import java.util.List;

import com.ecom.ecom2.model.comment_model.Comment;
import com.ecom.ecom2.model.item_model.Item;

public interface ItemDAO {
    public void createItem(Item item);
    public void updateItem(Item item);
    public void deleteItem(Item item);
    public Item getItemById(int id);
    public List<Item> getAllItems();
    public List<Item> getItemByCategory(String category);
    public List<Item> searchName(String query);
    public List<Item> sortByBestSelling();
    public void updatePrice(Item item, double price);
    public void addImage(Item item, String imgUrl);
    public void addCommentToItem(int itemId, Comment comment);
}
