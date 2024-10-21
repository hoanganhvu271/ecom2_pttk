package com.ecom.ecom2.dao.item_dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ecom.ecom2.model.comment_model.Comment;
import com.ecom.ecom2.model.customer_model.Customer;
import com.ecom.ecom2.model.item_model.Item;
import com.ecom.ecom2.model.rate_model.Rate;

import org.springframework.stereotype.Repository;

@Repository
public class ItemImpl implements ItemDAO {

    List<Item> itemList = new ArrayList<>();

    public ItemImpl() {

// Sample Data
itemList.add(new Item(1, "Smartphone", "Latest model smartphone", 699.99, 50, 
    new String[]{"electronics", "gadgets"}, new String[]{"image1.jpg", "image2.jpg"}, 
    Arrays.asList(new Comment(new Customer(2, "vu", null, null, null), "Great Product")), 
    new ArrayList<>(), 0.0));

itemList.add(new Item(2, "Washing Machine", "Automatic washing machine", 499.99, 30, 
    new String[]{"home", "appliances"}, new String[]{"image3.jpg", "image4.jpg"}, 
    Arrays.asList(new Comment(new Customer(3, "vuha12", null, null, null), "Very useful!")), 
    new ArrayList<>(), 0.0));

itemList.add(new Item(3, "Laptop", "High-performance laptop", 1099.99, 20, 
    new String[]{"computers", "laptops"}, new String[]{"image5.jpg", "image6.jpg"}, 
    Arrays.asList(new Comment(new Customer(4, "user123", null, null, null), "Amazing speed!")), 
    new ArrayList<>(), 0.0));

itemList.add(new Item(4, "Wireless Headphones", "Noise-cancelling headphones", 199.99, 100, 
    new String[]{"electronics", "accessories"}, new String[]{"image7.jpg", "image8.jpg"}, 
    Arrays.asList(new Comment(new Customer(5, "johndoe", null, null, null), "Crystal clear sound")), 
    new ArrayList<>(), 0.0));

itemList.add(new Item(5, "Dining Table", "Stylish wooden dining table", 399.99, 15, 
    new String[]{"home", "furniture"}, new String[]{"image9.jpg", "image10.jpg"}, 
    Arrays.asList(new Comment(new Customer(6, "janesmith", null, null, null), "Elegant design!")), 
    new ArrayList<>(), 0.0));

itemList.add(new Item(6, "Patio Set", "Outdoor patio furniture set", 799.99, 25, 
    new String[]{"outdoors", "furniture"}, new String[]{"image11.jpg", "image12.jpg"}, 
    Arrays.asList(new Comment(new Customer(7, "outdoorfan", null, null, null), "Great for my garden!")), 
    new ArrayList<>(), 0.0));

itemList.add(new Item(7, "Smartwatch", "Fitness tracking smartwatch", 249.99, 40, 
    new String[]{"electronics", "accessories"}, new String[]{"image13.jpg", "image14.jpg"}, 
    Arrays.asList(new Comment(new Customer(8, "fitguru", null, null, null), "Perfect for tracking workouts!")), 
    new ArrayList<>(), 0.0));

itemList.add(new Item(8, "Gaming Mouse", "Ergonomic gaming mouse", 79.99, 60, 
    new String[]{"computers", "accessories"}, new String[]{"image15.jpg", "image16.jpg"}, 
    Arrays.asList(new Comment(new Customer(9, "gamerboy", null, null, null), "Best mouse for gaming!")), 
    new ArrayList<>(), 0.0));

itemList.add(new Item(9, "Digital Camera", "High-resolution digital camera", 499.99, 10, 
    new String[]{"electronics", "cameras"}, new String[]{"image17.jpg", "image18.jpg"}, 
    Arrays.asList(new Comment(new Customer(10, "shutterbug", null, null, null), "Excellent photo quality")), 
    new ArrayList<>(), 0.0));

itemList.add(new Item(10, "Refrigerator", "Energy-efficient refrigerator", 899.99, 5, 
    new String[]{"home", "appliances"}, new String[]{"image19.jpg", "image20.jpg"}, 
    Arrays.asList(new Comment(new Customer(11, "coolguy", null, null, null), "Keeps everything super fresh!")), 
    new ArrayList<>(), 0.0));

    }
    

    @Override
    public void createItem(Item item) {
        // TODO: Implement the method
    }

    @Override
    public void updateItem(Item item) {
        // TODO: Implement the method
    }

    @Override
    public void deleteItem(Item item) {
        // TODO: Implement the method
    }

    @Override
    public Item getItemById(int id) {
        
        for (Item item : itemList) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public List<Item> getItemByCategory(String category) {
        // TODO: Implement the method
        return null; // Example return value
    }

    @Override
    public List<Item> searchName(String query) {
        // TODO: Implement the method
        return null; // Example return value
    }

    @Override
    public List<Item> sortByBestSelling() {
        // TODO: Implement the method
        return null; // Example return value
    }

    @Override
    public void updatePrice(Item item, double price) {
        // TODO: Implement the method
    }

    @Override
    public void addImage(Item item, String imgUrl) {
        // TODO: Implement the method
    }

    @Override
    public List<Item> getAllItems() {
        return itemList;
    }


    @Override
public void addCommentToItem(int itemId, Comment comment) {
    for (Item i : itemList) {
        if (i.getId() == itemId) {
            // Chuyển danh sách bình luận sang ArrayList để có thể thêm phần tử
            List<Comment> comments = new ArrayList<>(i.getComments());
            comments.add(comment);
            i.setComments(comments); // Cập nhật lại danh sách comments trong Item
            System.out.println("Added comment to item with ID: " + itemId);
        }
    }
}

}
