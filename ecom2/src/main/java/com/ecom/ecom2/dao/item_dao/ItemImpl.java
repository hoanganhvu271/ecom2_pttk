package com.ecom.ecom2.dao.item_dao;

import java.util.ArrayList;
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

        List<Comment> comments = new ArrayList<>();
        List<Rate> rates = new ArrayList<>();

        comments.add(new Comment(new Customer(2,"vu", null, null, null), "Greate Poduct"));
        comments.add(new Comment(new Customer(3,"vuha12", null, null, null), "Siuuu"));

        // Sample Data
        String[] tags1 = {"electronics", "gadgets"};
        String[] images1 = {"image1.jpg", "image2.jpg"};
        itemList.add(new Item(1, "Smartphone", "Latest model smartphone", 699.99, 50, tags1, images1, comments, rates, 0.0));
    
        String[] tags2 = {"home", "appliances"};
        String[] images2 = {"image3.jpg", "image4.jpg"};
        itemList.add(new Item(2, "Washing Machine", "Automatic washing machine", 499.99, 30, tags2, images2, comments, rates, 0.0));
    
        String[] tags3 = {"computers", "laptops"};
        String[] images3 = {"image5.jpg", "image6.jpg"};
        itemList.add(new Item(3, "Laptop", "High-performance laptop", 1099.99, 20, tags3, images3, comments, rates, 0.0));
    
        String[] tags4 = {"electronics", "accessories"};
        String[] images4 = {"image7.jpg", "image8.jpg"};
        itemList.add(new Item(4, "Wireless Headphones", "Noise-cancelling headphones", 199.99, 100, tags4, images4, comments, rates, 0.0));
    
        String[] tags5 = {"home", "furniture"};
        String[] images5 = {"image9.jpg", "image10.jpg"};
        itemList.add(new Item(5, "Dining Table", "Stylish wooden dining table", 399.99, 15, tags5, images5, comments, rates, 0.0));
    
        String[] tags6 = {"outdoors", "furniture"};
        String[] images6 = {"image11.jpg", "image12.jpg"};
        itemList.add(new Item(6, "Patio Set", "Outdoor patio furniture set", 799.99, 25, tags6, images6, comments, rates, 0.0));
    
        String[] tags7 = {"electronics", "accessories"};
        String[] images7 = {"image13.jpg", "image14.jpg"};
        itemList.add(new Item(7, "Smartwatch", "Fitness tracking smartwatch", 249.99, 40, tags7, images7, comments, rates, 0.0));
    
        String[] tags8 = {"computers", "accessories"};
        String[] images8 = {"image15.jpg", "image16.jpg"};
        itemList.add(new Item(8, "Gaming Mouse", "Ergonomic gaming mouse", 79.99, 60, tags8, images8, comments, rates, 0.0));
    
        String[] tags9 = {"electronics", "cameras"};
        String[] images9 = {"image17.jpg", "image18.jpg"};
        itemList.add(new Item(9, "Digital Camera", "High-resolution digital camera", 499.99, 10, tags9, images9, comments, rates, 0.0));
    
        String[] tags10 = {"home", "appliances"};
        String[] images10 = {"image19.jpg", "image20.jpg"};
        itemList.add(new Item(10, "Refrigerator", "Energy-efficient refrigerator", 899.99, 5, tags10, images10, comments, rates, 0.0));
    
        String[] tags11 = {"electronics", "audio"};
        String[] images11 = {"image21.jpg", "image22.jpg"};
        itemList.add(new Item(11, "Bluetooth Speaker", "Portable Bluetooth speaker", 149.99, 80, tags11, images11, comments, rates, 0.0));
    
        String[] tags12 = {"computers", "accessories"};
        String[] images12 = {"image23.jpg", "image24.jpg"};
        itemList.add(new Item(12, "Mechanical Keyboard", "RGB mechanical keyboard", 119.99, 70, tags12, images12, comments, rates, 0.0));
    
        String[] tags13 = {"home", "kitchen"};
        String[] images13 = {"image25.jpg", "image26.jpg"};
        itemList.add(new Item(13, "Coffee Maker", "Single-serve coffee maker", 89.99, 45, tags13, images13, comments, rates, 0.0));
    
        String[] tags14 = {"outdoors", "sports"};
        String[] images14 = {"image27.jpg", "image28.jpg"};
        itemList.add(new Item(14, "Camping Tent", "Waterproof camping tent", 159.99, 30, tags14, images14, comments, rates, 0.0));
    
        String[] tags15 = {"electronics", "wearables"};
        String[] images15 = {"image29.jpg", "image30.jpg"};
        itemList.add(new Item(15, "Fitness Tracker", "Track your fitness goals", 99.99, 65, tags15, images15, comments, rates, 0.0));
    
        String[] tags16 = {"home", "appliances"};
        String[] images16 = {"image31.jpg", "image32.jpg"};
        itemList.add(new Item(16, "Air Purifier", "HEPA air purifier", 299.99, 20, tags16, images16, comments, rates, 0.0));
    
        String[] tags17 = {"electronics", "computers"};
        String[] images17 = {"image33.jpg", "image34.jpg"};
        itemList.add(new Item(17, "External Hard Drive", "2TB external hard drive", 89.99, 50, tags17, images17, comments, rates, 0.0));
    
        String[] tags18 = {"home", "kitchen"};
        String[] images18 = {"image35.jpg", "image36.jpg"};
        itemList.add(new Item(18, "Blender", "High-speed blender", 79.99, 75, tags18, images18, comments, rates, 0.0));
    
        String[] tags19 = {"computers", "accessories"};
        String[] images19 = {"image37.jpg", "image38.jpg"};
        itemList.add(new Item(19, "Laptop Stand", "Adjustable laptop stand", 39.99, 120, tags19, images19, comments, rates, 0.0));
    
        String[] tags20 = {"home", "furniture"};
        String[] images20 = {"image39.jpg", "image40.jpg"};
        itemList.add(new Item(20, "Bookshelf", "Wooden bookshelf", 149.99, 60, tags20, images20, comments, rates, 0.0));
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
}
