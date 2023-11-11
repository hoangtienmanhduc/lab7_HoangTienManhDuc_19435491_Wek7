package com.example.week7.pks;

import com.example.week7.entities.Product;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ProductPricePK implements Serializable {
    private Product product;
    private LocalDateTime price_date_time;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDateTime getPrice_date_time() {
        return price_date_time;
    }

    public void setPrice_date_time(LocalDateTime price_date_time) {
        this.price_date_time = price_date_time;
    }
}
