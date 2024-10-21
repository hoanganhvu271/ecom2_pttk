package com.ecom.ecom2.model.comment_model;

import com.ecom.ecom2.model.customer_model.Customer;

public class Comment {
    private Customer customer;
    private String commentText;
    public Comment(Customer customer, String commentText) {
        this.customer = customer;
        this.commentText = commentText;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String getCommentText() {
        return commentText;
    }
    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }
}
