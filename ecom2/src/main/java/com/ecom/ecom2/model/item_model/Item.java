package com.ecom.ecom2.model.item_model;

import java.util.List;

import com.ecom.ecom2.model.comment_model.Comment;
import com.ecom.ecom2.model.rate_model.Rate;

public class Item {
    private int id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String[] tags;
    private String[] images;
    private List<Comment> comments;
    private List<Rate> rates;
    private double totalRating; 


    public Item(int id, String name, String description, double price, int quantity, String[] tags, String[] images, List<Comment> comments, List<Rate> rates, double totalRating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.tags = tags;
        this.images = images;
        this.comments = comments;
        this.rates = rates;
        this.totalRating = totalRating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    public double getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(double totalRating) {
        this.totalRating = totalRating;
    }

    


}
