package com.example.t2305m_springboot.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "grand_total")
    private Double grandTotal;
    @Column(name = "created_at")
    private Date createAt;
    private Long status;
    @Column(name = "shipping_address")
    private String shippingAddress;
    private String telephone;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "order_items",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;
}
