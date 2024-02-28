package com.pedrovaz.primeiroprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrovaz.primeiroprojeto.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
