package com.pedrovaz.primeiroprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrovaz.primeiroprojeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}