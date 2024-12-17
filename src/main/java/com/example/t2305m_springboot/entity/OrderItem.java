package com.example.t2305m_springboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double price;
    private Long qty;
    @Column(name = "product_id", nullable = false)
    private Long productId;
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;
}
