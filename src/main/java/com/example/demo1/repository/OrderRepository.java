package com.example.demo1.repository;

import com.example.demo1.model.domain.Customer;
import com.example.demo1.model.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, String> {
    List<Order> findByCustomer(Customer customer);
}
