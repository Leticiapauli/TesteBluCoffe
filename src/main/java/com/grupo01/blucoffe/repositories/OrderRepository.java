package com.grupo01.blucoffe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo01.blucoffe.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
