package com.pedrovaz.primeiroprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrovaz.primeiroprojeto.entities.OrderItem;
import com.pedrovaz.primeiroprojeto.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
