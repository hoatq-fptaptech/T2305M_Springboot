package com.example.t2305m_springboot.service;

import com.example.t2305m_springboot.dto.req.OrderReq;
import com.example.t2305m_springboot.repository.OrderRepository;
import com.example.t2305m_springboot.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    public OrderService(OrderRepository orderRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    public void createOrder(OrderReq orderReq){

    }
}
