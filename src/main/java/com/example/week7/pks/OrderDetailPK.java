package com.example.week7.pks;


import com.example.week7.entities.Order;
import com.example.week7.entities.Product;

import java.io.Serializable;
public class OrderDetailPK implements Serializable {
    private Order order;
    private Product product;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
