package com.example.productorderservice.order.application.port;

import com.example.productorderservice.order.domain.Order;
import com.example.productorderservice.product.domain.Product;

interface OrderPort {
    Product getProductById(long productId);

    void save(Order order);
}
